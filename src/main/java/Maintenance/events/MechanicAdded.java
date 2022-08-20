package Maintenance.events;

import Maintenance.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicAdded extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicName mechanicName;
    private final MechanicDNI mechanicDNI;
    private final MechanicUniform mechanicUniform;

    private final MechanicHoursWorked mechanicHoursWorked;

    public MechanicAdded( MechanicID mechanicID, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform, MechanicHoursWorked mechanicHoursWorked) {
        super("DDD.Maintenances.MechanicAdded");
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
        this.mechanicDNI = mechanicDNI;
        this.mechanicUniform = mechanicUniform;
        this.mechanicHoursWorked = mechanicHoursWorked;
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

    public MechanicHoursWorked getMechanicHoursWorked() {
        return mechanicHoursWorked;
    }
}
