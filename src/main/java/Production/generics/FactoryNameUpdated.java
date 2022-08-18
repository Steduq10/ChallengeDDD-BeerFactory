package Production.generics;

import co.com.sofka.domain.generic.DomainEvent;

public class FactoryNameUpdated extends DomainEvent {
    private final FactoryName factoryName;

    public FactoryNameUpdated( FactoryName factoryName) {
        super("DDD.FactoryNameUpdated");
        this.factoryName = factoryName;
    }

    public FactoryName getFactoryName(){
        return factoryName;
    }
}
