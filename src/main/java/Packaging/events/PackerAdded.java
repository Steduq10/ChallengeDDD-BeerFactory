package Packaging.events;

import Packaging.values.PackerDNI;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import Packaging.values.PackerUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerAdded extends DomainEvent {

    private final PackerID packerID;
    private final PackerName packerName;
    private final PackerDNI packerDNI;
    private final PackerUniform packerUniform;

    public PackerAdded( PackerID packerID, PackerName packerName, PackerDNI packerDNI, PackerUniform packerUniform) {
        super("DDD.Packaging.PackerAdded");
        this.packerID = packerID;
        this.packerName = packerName;
        this.packerDNI = packerDNI;
        this.packerUniform = packerUniform;
    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerName getPackerName() {
        return packerName;
    }

    public PackerDNI getPackerDNI() {
        return packerDNI;
    }

    public PackerUniform getPackerUniform() {
        return packerUniform;
    }
}
