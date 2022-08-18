package Production.events;

import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductionCreated extends DomainEvent {
    private final FactoryName factoryName;
    private final ProductionID productionID;

    public  ProductionCreated(FactoryName factoryName, ProductionID productionID){
        super("DDD.Production.ProductionCreated");
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
