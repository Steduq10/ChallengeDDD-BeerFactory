package Maintenance.events;

import Production.generics.FactoryName;
import co.com.sofka.domain.generic.DomainEvent;

public class MaintenanceCreated extends DomainEvent {
    private final FactoryName factoryName;


    public MaintenanceCreated(FactoryName factoryName) {
        super("DDD.Maintenance.MaintenanceCreated");
        this.factoryName = factoryName;

    }

    public FactoryName getFactoryName() {
        return factoryName;
    }


}

