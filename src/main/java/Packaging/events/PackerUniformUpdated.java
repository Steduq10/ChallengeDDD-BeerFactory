package Packaging.events;

import Packaging.values.PackerDNI;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import Packaging.values.PackerUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerUniformUpdated extends DomainEvent {


    private final PackerID packerID;
    private final PackerUniform packerUniform;

    public PackerUniformUpdated( PackerID packerID, PackerUniform packerUniform) {
        super("DDD.Packaging.PackerUniformUpdated");
        this.packerID = packerID;
        this.packerUniform = packerUniform;
    }

    public PackerID getPackerID() {
        return packerID;
    }


    public PackerUniform getPackerUniform() {
        return packerUniform;
    }
}
