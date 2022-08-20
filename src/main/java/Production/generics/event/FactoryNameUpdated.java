package Production.generics.event;

import co.com.sofka.domain.generic.DomainEvent;
import Production.generics.FactoryName;

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
