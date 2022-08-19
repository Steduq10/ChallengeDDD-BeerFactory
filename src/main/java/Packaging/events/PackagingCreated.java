package Packaging.events;

import Production.generics.FactoryName;
import co.com.sofka.domain.generic.DomainEvent;

public class PackagingCreated extends DomainEvent {

    private final FactoryName factoryName;


    public PackagingCreated(FactoryName factoryName) {
        super("DDD.Packaging.PackagingCreated");
        this.factoryName = factoryName;

    }

    public FactoryName getFactoryName() {
        return factoryName;
    }
}
