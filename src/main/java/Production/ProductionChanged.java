package Production;

import Production.events.*;
import generics.events.FactoryNameUpdated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ProductionChanged extends EventChange {
    public  ProductionChanged(Production production){
        apply((ProductionCreated event) ->{
            production.factoryName = event.getFactoryName();
            production.commodities = new HashSet<>();
            production.productionEmployees = new HashSet<>();
        });

        apply((CommodityAdded event)->{
            production.commodities.add(new Commodity(
                    event.getCommodityID(),
                    event.getCommodityName(),
                    event.getCommodityQuantity(),
                    event.getCommodityPrice()
            ));
        });

        apply((FactoryNameUpdated event)->{
            production.factoryName = event.getFactoryName();
        });


        apply((CommodityPriceChanged event)->{
            var commodity = production.getCommodityById(event.getCommodityID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the commodity"));
            commodity.ChangePrice(event.getCommodityPrice());
        });

        apply((CommodityQuantityChanged event)->{
            var commodity = production.getCommodityById(event.getCommodityID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the commodity"));
            commodity.ChangeQuantity(event.getCommodityQuantity());
        });

        apply((ProductionEmployeAdded event)->{
            var numberOfEmployees = production.productionEmployees().size();
            if (numberOfEmployees == 50){
                throw new IllegalArgumentException("Maximum amount of employees reached, you can't add more");
            }
            production.productionEmployees.add(new ProductionEmployee(
                    event.getProductionEmployeID(),
                    event.getProductionEmployeName(),
                    event.getProductionEmployeDNI(),
                    event.getProductionEmployeUniform(),
                    event.getProductionEmployeHoursWorked()

            ));
        });



        apply((EmployeHoursWorkedUpdated event)->{
            var employee = production.getProductionEmployeeById(event.getProductionEmployeID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the employee"));
            employee.UpdateHoursWorked(event.getProductionEmployeHoursWorked());
        });

        apply((EmployUniformUpdated event)->{
            var employee = production.getProductionEmployeeById(event.getProductionEmployeID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the employee"));
            employee.UpdateUniform(event.getProductionEmployeUniform());
        });

    }
}
