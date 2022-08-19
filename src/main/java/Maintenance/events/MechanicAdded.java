package Maintenance.events;

import Maintenance.values.MechanicDNI;
import Maintenance.values.MechanicID;
import Maintenance.values.MechanicName;
import Maintenance.values.MechanicUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicAdded extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicName mechanicName;
    private final MechanicDNI mechanicDNI;
    private final MechanicUniform mechanicUniform;

    public MechanicAdded( MechanicID mechanicID, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform) {
        super("DDD.Maintenances.MechanicAdded");
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
        this.mechanicDNI = mechanicDNI;
        this.mechanicUniform = mechanicUniform;
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
