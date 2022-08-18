package Production.commands;

import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class CreateProduction extends Command {
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
