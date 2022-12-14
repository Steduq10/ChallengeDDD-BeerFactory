package Production.events;

import generics.FactoryName;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductionCreated extends DomainEvent {
    private final FactoryName factoryName;


    public ProductionCreated(FactoryName factoryName) {
        super("DDD.Production.ProductionCreated");
        this.factoryName = factoryName;

    }

    public FactoryName getFactoryName() {
        return factoryName;
    }


}

