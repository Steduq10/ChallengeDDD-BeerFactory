package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateMechanicDNI extends Command {
    private final MaintenainceID maintenainceID;
    private final MechanicID mechanicID;
    private final MechanicDNI mechanicDNI;

    public UpdateMechanicDNI(MaintenainceID maintenainceID, MechanicID mechanicID, MechanicDNI mechanicDNI) {
        this.maintenainceID = maintenainceID;
        this.mechanicID = mechanicID;
        this.mechanicDNI = mechanicDNI;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicDNI getMechanicDNI() {
        return mechanicDNI;
    }
}
