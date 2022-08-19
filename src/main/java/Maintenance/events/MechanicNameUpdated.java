package Maintenance.events;

import Maintenance.values.MechanicID;
import Maintenance.values.MechanicName;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicNameUpdated extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicName mechanicName;

    public MechanicNameUpdated( MechanicID mechanicID, MechanicName mechanicName) {
        super("DDD.Maintenances.MechanicNameUpdated");
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicName getMechanicName() {
        return mechanicName;
    }
}
