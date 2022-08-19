package Packaging;


import Packaging.values.PackerDNI;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import Packaging.values.PackerUniform;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Packer extends Entity <PackerID> {
    private PackerName packerName;
    private PackerDNI packerDNI;
    private PackerUniform packerUniform;

    public Packer(PackerID entityId, PackerName packerName, PackerDNI packerDNI, PackerUniform packerUniform) {
        super(entityId);
        this.packerName = packerName;
        this.packerDNI = packerDNI;
        this.packerUniform = packerUniform;
    }

    public void UpdateName(PackerName packerName){
        this.packerName = Objects.requireNonNull(packerName);
    }

    public void UpdateDNI(PackerDNI packerDNI){
        this.packerDNI = Objects.requireNonNull(packerDNI);
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
}
