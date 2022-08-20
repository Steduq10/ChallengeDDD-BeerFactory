package Packaging;


import Packaging.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Packer extends Entity <PackerID> {
    private PackerName packerName;
    private PackerDNI packerDNI;
    private PackerUniform packerUniform;

    private PackerHoursWorked packerHoursWorked;

    public Packer(PackerID entityId, PackerName packerName, PackerDNI packerDNI, PackerUniform packerUniform, PackerHoursWorked packerHoursWorked) {
        super(entityId);
        this.packerName = packerName;
        this.packerDNI = packerDNI;
        this.packerUniform = packerUniform;
        this.packerHoursWorked = packerHoursWorked;
    }



    public void UpdateHoursWorked(PackerHoursWorked packerHoursWorked){
        this.packerHoursWorked = Objects.requireNonNull(packerHoursWorked);
    }

    public void UpdateUniform(PackerUniform packerUniform){
        this.packerUniform = Objects.requireNonNull(packerUniform);
    }

    public PackerName packerName() {
        return packerName;
    }

    public PackerDNI packerDNI() {
        return packerDNI;
    }

    public PackerUniform packerUniform() {
        return packerUniform;
    }

    public PackerHoursWorked packerHoursWorked() {
        return packerHoursWorked;
    }
}
