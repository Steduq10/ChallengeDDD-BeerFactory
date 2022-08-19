package Packaging.events;

import Packaging.values.PackerDNI;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import Packaging.values.PackerUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerDNIUpdated extends DomainEvent {


    private final PackerID packerID;

    private final PackerDNI packerDNI;


    public PackerDNIUpdated( PackerID packerID, PackerDNI packerDNI) {
        super("DDD.Packaging.PackerDNIUpdated");
        this.packerID = packerID;
        this.packerDNI = packerDNI;

    }

    public PackerID getPackerID() {
        return packerID;
    }



    public PackerDNI getPackerDNI() {
        return packerDNI;
    }


}
