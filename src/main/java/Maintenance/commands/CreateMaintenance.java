package Maintenance.commands;

import Maintenance.values.MaintenainceID;
import generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class CreateMaintenance extends Command {
    private final MaintenainceID maintenainceID;
    private final FactoryName factoryName;
    private final ProductionID productionID;

    public CreateMaintenance(MaintenainceID maintenainceID, FactoryName factoryName, ProductionID productionID) {
        this.maintenainceID = maintenainceID;
        this.factoryName = factoryName;
        this.productionID = productionID;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public FactoryName getFactoryName() {
        return factoryName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }
}
