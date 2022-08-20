package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateMechanicHoursWorked extends Command {
    private final MaintenainceID maintenainceID;
    private final MechanicID mechanicID;
    private final MechanicHoursWorked mechanicHoursWorked;

    public UpdateMechanicHoursWorked(MaintenainceID maintenainceID, MechanicID mechanicID, MechanicHoursWorked mechanicHoursWorked) {
        this.maintenainceID = maintenainceID;
        this.mechanicID = mechanicID;
        this.mechanicHoursWorked = mechanicHoursWorked;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicHoursWorked getMechanicHoursWorked() {
        return mechanicHoursWorked;
    }
}
