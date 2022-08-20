package Production;

import Production.events.*;
import generics.event.FactoryNameUpdated;
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

        apply((CommodityNameChanged event)->{
           var commodity = production.getCommodityById(event.getCommodityID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the commodity"));
           commodity.ChangeName(event.getCommodityName());
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
                    event.getProductionEmployeUniform()
            ));
        });

        apply((EmployeDNIUpdated event)->{
            var employee = production.getProductionEmployeeById(event.getProductionEmployeID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the employee"));
            employee.UpdateDNI(event.getProductionEmployeDNI());
        });

        apply((EmployeNameUpdated event)->{
            var employee = production.getProductionEmployeeById(event.getProductionEmployeID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the employee"));
            employee.UpdateName(event.getProductionEmployeName());
        });

        apply((EmployUniformUpdated event)->{
            var employee = production.getProductionEmployeeById(event.getProductionEmployeID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the employee"));
            employee.UpdateUniform(event.getProductionEmployeUniform());
        });

    }
}
