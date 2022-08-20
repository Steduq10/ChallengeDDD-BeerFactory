package Packaging.commands;

import Packaging.values.PackagingID;
import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class CreatePackaging extends Command {
    private final PackagingID packagingID;
    private final FactoryName factoryName;
    private final ProductionID productionID;

    public CreatePackaging(PackagingID packagingID, FactoryName factoryName, ProductionID productionID) {
        this.packagingID = packagingID;
        this.factoryName = factoryName;
        this.productionID = productionID;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public FactoryName getFactoryName() {
        return factoryName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }
}
