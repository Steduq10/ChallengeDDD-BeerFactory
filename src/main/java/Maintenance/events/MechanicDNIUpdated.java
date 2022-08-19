package Maintenance.events;

import Maintenance.values.MechanicDNI;
import Maintenance.values.MechanicID;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicDNIUpdated extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicDNI mechanicDNI;

    public MechanicDNIUpdated( MechanicID mechanicID, MechanicDNI mechanicDNI) {
        super("DDD.Maintenances.MechanicDNIUpdated");
        this.mechanicID = mechanicID;
        this.mechanicDNI = mechanicDNI;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicDNI getMechanicDNI() {
        return mechanicDNI;
    }
}
