package Production.commands;

import Production.generics.FactoryName;
import Production.values.ProductionID;

public class CreateProduction {
    private final ProductionID productionID;
    private final FactoryName factoryName;

    public CreateProduction(ProductionID productionID, FactoryName factoryName) {
        this.productionID = productionID;
        this.factoryName = factoryName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public FactoryName getFactoryName() {
        return factoryName;
    }
}
