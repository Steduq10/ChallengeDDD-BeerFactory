package Maintenance.events;

import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.DomainEvent;

public class MaintenanceCreated extends DomainEvent {
    private final FactoryName factoryName;
    private final ProductionID productionID;

    public MaintenanceCreated(FactoryName factoryName, ProductionID productionID) {
        super("DDD.Maintenance.MaintenanceCreated");
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

