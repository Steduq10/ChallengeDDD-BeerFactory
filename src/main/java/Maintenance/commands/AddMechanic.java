package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class AddMechanic extends Command {
    private final MaintenainceID maintenainceID;
    private final MechanicID mechanicID;
    private final MechanicName mechanicName;
    private final MechanicDNI mechanicDNI;
    private final MechanicUniform mechanicUniform;

    public AddMechanic(MaintenainceID maintenainceID, MechanicID mechanicID, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform) {
        this.maintenainceID = maintenainceID;
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
        this.mechanicDNI = mechanicDNI;
        this.mechanicUniform = mechanicUniform;
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

    public MechanicDNI getMechanicDNI() {
        return mechanicDNI;
    }

    public MechanicUniform getMechanicUniform() {
        return mechanicUniform;
    }
}
