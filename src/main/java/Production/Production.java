package Production;

import Production.events.*;
import Production.generics.FactoryName;
import Production.generics.event.FactoryNameUpdated;
import Production.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Production extends AggregateEvent<ProductionID> {
    protected FactoryName factoryName;
    protected Set<Commodity> commodities;
    protected Set<ProductionEmployee> productionEmployees;

    public Production(ProductionID entityId, FactoryName factoryName){
        super(entityId);
        appendChange(new ProductionCreated(factoryName)).apply();
    }

    private Production(ProductionID productionID){
        super(productionID);
        subscribe(new ProductionChanged(this));
    }

    public static Production from(ProductionID productionID, List<DomainEvent>events){
        var production = new Production(productionID);
        events.forEach(production::applyEvent);
        return production;
    }

    public void updateFactoryName(FactoryName factoryName){
        Objects.requireNonNull(factoryName);
        appendChange(new FactoryNameUpdated(factoryName)).apply();
    }

    public void addCommodity(CommodityID entityID, CommodityName commodityName, CommodityQuantity commodityQuantity, CommodityPrice commodityPrice){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(commodityName);
        Objects.requireNonNull(commodityQuantity);
        Objects.requireNonNull(commodityPrice);
        appendChange(new CommodityAdded(entityID, commodityName, commodityQuantity, commodityPrice)).apply();
    }

    public void addProductionEmployee(ProductionEmployeID entityID, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform, ProductionEmployeHoursWorked productionEmployeHoursWorked){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(productionEmployeName);
        Objects.requireNonNull(productionEmployeDNI);
        Objects.requireNonNull(productionEmployeUniform);
        appendChange(new ProductionEmployeAdded(entityID, productionEmployeName, productionEmployeDNI, productionEmployeUniform, productionEmployeHoursWorked)).apply();
    }

    public void changeCommodityPrice(CommodityID commodityID, CommodityPrice commodityPrice){
        Objects.requireNonNull(commodityID);
        Objects.requireNonNull(commodityPrice);
        appendChange(new CommodityPriceChanged(commodityID, commodityPrice)).apply();
    }

    public void changeCommodityQuantity(CommodityID commodityID, CommodityQuantity commodityQuantity){
        Objects.requireNonNull(commodityID);
        Objects.requireNonNull(commodityQuantity);
        appendChange(new CommodityQuantityChanged(commodityID, commodityQuantity)).apply();
    }

    public void updateEmployeeHoursWorked(ProductionEmployeID productionEmployeID, ProductionEmployeHoursWorked productionEmployeHoursWorked){
        Objects.requireNonNull(productionEmployeID);
        Objects.requireNonNull(productionEmployeHoursWorked);
        appendChange(new EmployeHoursWorkedUpdated(productionEmployeID, productionEmployeHoursWorked)).apply();
    }


    public void updateEmployeeUniform(ProductionEmployeID productionEmployeID, ProductionEmployeUniform productionEmployeUniform){
        Objects.requireNonNull(productionEmployeID);
        Objects.requireNonNull(productionEmployeUniform);
        appendChange(new EmployUniformUpdated(productionEmployeID, productionEmployeUniform)).apply();
    }

    public Optional<Commodity> getCommodityById(CommodityID commodityID){
        return commodities().stream().filter((commodity -> commodity.identity().equals(commodityID))).findFirst();
    }

    public Optional<ProductionEmployee> getProductionEmployeeById(ProductionEmployeID productionEmployeID){
        return productionEmployees().stream().filter((productionEmployee -> productionEmployee.identity().equals(productionEmployeID))).findFirst();
    }

    public FactoryName factoryName(){
        return  factoryName;
    }

    public Set<Commodity> commodities(){
        return commodities;
    }

    public Set<ProductionEmployee> productionEmployees(){
        return productionEmployees;
    }
}
