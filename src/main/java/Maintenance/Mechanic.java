package Maintenance;

import Maintenance.values.MechanicDNI;
import Maintenance.values.MechanicID;
import Maintenance.values.MechanicName;
import Maintenance.values.MechanicUniform;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Mechanic extends Entity<MechanicID> {
    private MechanicName mechanicName;
    private MechanicDNI mechanicDNI;
    private MechanicUniform mechanicUniform;

    public Mechanic(MechanicID entityId, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform) {
        super(entityId);
        this.mechanicName = mechanicName;
        this.mechanicDNI = mechanicDNI;
        this.mechanicUniform = mechanicUniform;
    }

    public void UpdateName(MechanicName mechanicName){
        this.mechanicName = Objects.requireNonNull(mechanicName);
    }

    public void UpdateDNI(MechanicDNI mechanicDNI){
        this.mechanicDNI = Objects.requireNonNull(mechanicDNI);
    }

    public void UpdateUniform(MechanicUniform mechanicUniform){
        this.mechanicUniform = Objects.requireNonNull(mechanicUniform);
    }

    public MechanicName mechanicName() {
        return mechanicName;
    }

    public MechanicDNI mechanicDNI() {
        return mechanicDNI;
    }

    public MechanicUniform mechanicUniform() {
        return mechanicUniform;
    }
}
