package Packaging.events;

import generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.DomainEvent;

public class PackagingCreated extends DomainEvent {

    private final FactoryName factoryName;
    private final ProductionID productionID;


    public PackagingCreated(FactoryName factoryName, ProductionID productionID) {
        super("DDD.Packaging.PackagingCreated");
        this.factoryName = factoryName;
        this.productionID = productionID;

    }

    public FactoryName getFactoryName() {
        return factoryName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }
}
