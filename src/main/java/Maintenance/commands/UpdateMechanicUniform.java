package Maintenance.commands;

import Maintenance.values.*;

public class UpdateMechanicUniform {
    private final MaintenainceID maintenainceID;
    private final MechanicID mechanicID;
    private final MechanicUniform mechanicUniform;

    public UpdateMechanicUniform(MaintenainceID maintenainceID, MechanicID mechanicID, MechanicUniform mechanicUniform) {
        this.maintenainceID = maintenainceID;
        this.mechanicID = mechanicID;
        this.mechanicUniform = mechanicUniform;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicUniform getMechanicUniform() {
        return mechanicUniform;
    }
}
