package Maintenance.commands;

import Maintenance.values.MaintenainceID;
import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class UpdateFactoryName extends Command {
    private final MaintenainceID maintenainceID;
    private final FactoryName factoryName;

    public UpdateFactoryName(MaintenainceID maintenainceID, FactoryName factoryName) {
        this.maintenainceID = maintenainceID;
        this.factoryName = factoryName;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public FactoryName getFactoryName() {
        return factoryName;
    }
}
