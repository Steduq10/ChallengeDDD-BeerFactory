package Maintenance;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Mechanic extends Entity<MechanicID> {
    private MechanicName mechanicName;
    private MechanicDNI mechanicDNI;
    private MechanicUniform mechanicUniform;

    private MechanicHoursWorked mechanicHoursWorked;

    public Mechanic(MechanicID entityId, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform, MechanicHoursWorked mechanicHoursWorked) {
        super(entityId);
        this.mechanicName = mechanicName;
        this.mechanicDNI = mechanicDNI;
        this.mechanicUniform = mechanicUniform;
        this.mechanicHoursWorked = mechanicHoursWorked;
    }


    public void UpdateHoursWorked(MechanicHoursWorked mechanicHoursWorked){
        this.mechanicHoursWorked = Objects.requireNonNull(mechanicHoursWorked);
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

    public MechanicHoursWorked mechanicHoursWorked() {
        return mechanicHoursWorked;
    }
}
