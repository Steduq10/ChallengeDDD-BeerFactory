package Packaging.events;

import Packaging.values.PackerDNI;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import Packaging.values.PackerUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerNameUpdated extends DomainEvent {


    private final PackerID packerID;
    private final PackerName packerName;


    public PackerNameUpdated( PackerID packerID, PackerName packerName) {
        super("DDD.Packaging.PackerNameUpdated");
        this.packerID = packerID;
        this.packerName = packerName;

    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerName getPackerName() {
        return packerName;
    }

}
