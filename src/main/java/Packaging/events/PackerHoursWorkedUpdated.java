package Packaging.events;

import Packaging.values.PackerHoursWorked;
import Packaging.values.PackerID;
import Packaging.values.PackerName;
import co.com.sofka.domain.generic.DomainEvent;

public class PackerHoursWorkedUpdated extends DomainEvent {


    private final PackerID packerID;
    private final PackerHoursWorked packerHoursWorked;


    public PackerHoursWorkedUpdated(PackerID packerID, PackerHoursWorked packerHoursWorked) {
        super("DDD.Packaging.PackerHoursWorkedUpdated");
        this.packerID = packerID;
        this.packerHoursWorked = packerHoursWorked;

    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerHoursWorked getPackerHoursWorked() {
        return packerHoursWorked;
    }

}
