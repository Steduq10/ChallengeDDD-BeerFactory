package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateMechanicName extends Command {
    private final MaintenainceID maintenainceID;
    private final MechanicID mechanicID;
    private final MechanicName mechanicName;

    public UpdateMechanicName(MaintenainceID maintenainceID, MechanicID mechanicID, MechanicName mechanicName) {
        this.maintenainceID = maintenainceID;
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicName getMechanicName() {
        return mechanicName;
    }
}
