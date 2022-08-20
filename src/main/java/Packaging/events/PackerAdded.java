package Packaging.events;

import Packaging.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerAdded extends DomainEvent {

    private final PackerID packerID;
    private final PackerName packerName;
    private final PackerDNI packerDNI;
    private final PackerUniform packerUniform;

    private final PackerHoursWorked packerHoursWorked;

    public PackerAdded( PackerID packerID, PackerName packerName, PackerDNI packerDNI, PackerUniform packerUniform, PackerHoursWorked packerHoursWorked) {
        super("DDD.Packaging.PackerAdded");
        this.packerID = packerID;
        this.packerName = packerName;
        this.packerDNI = packerDNI;
        this.packerUniform = packerUniform;
        this.packerHoursWorked = packerHoursWorked;
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

    public PackerHoursWorked getPackerHoursWorked() {
        return packerHoursWorked;
    }
}
