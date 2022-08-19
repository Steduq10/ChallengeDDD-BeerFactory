package Maintenance.events;


import Maintenance.values.MechanicID;
import Maintenance.values.MechanicUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class MechanicUniformUpdated extends DomainEvent {
    private final MechanicID mechanicID;
    private final MechanicUniform mechanicUniform;

    public MechanicUniformUpdated( MechanicID mechanicID, MechanicUniform mechanicUniform) {
        super("DDD.Maintenances.MechanicUniformUpdated");
        this.mechanicID = mechanicID;
        this.mechanicUniform = mechanicUniform;
    }

    public MechanicID getMechanicID() {
        return mechanicID;
    }

    public MechanicUniform getMechanicUniform() {
        return mechanicUniform;
    }
}
