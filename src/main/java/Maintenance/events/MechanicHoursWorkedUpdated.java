package Maintenance.events;

import Maintenance.values.MechanicDNI;
import Maintenance.values.MechanicHoursWorked;
import Maintenance.values.MechanicID;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicHoursWorkedUpdated extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicHoursWorked mechanicHoursWorked;

    public MechanicHoursWorkedUpdated(MechanicID mechanicID, MechanicHoursWorked mechanicHoursWorked) {
        super("DDD.Maintenances.MechanicDNIUpdated");
        this.mechanicID = mechanicID;
        this.mechanicHoursWorked = mechanicHoursWorked;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicHoursWorked getMechanicHoursWorked() {
        return mechanicHoursWorked;
    }
}
