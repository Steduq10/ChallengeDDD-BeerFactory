package Production.commands;

import generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class UpdateFactoryName extends Command {
    private final ProductionID productionID;
    private final FactoryName factoryName;

    public UpdateFactoryName(ProductionID productionID, FactoryName factoryName) {
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
