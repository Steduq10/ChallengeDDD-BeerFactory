package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdatePackerHoursWorked extends Command {

    private final PackagingID packagingID;
    private final PackerID packerID;
    private final PackerHoursWorked packerHoursWorked;

    public UpdatePackerHoursWorked(PackagingID packagingID, PackerID packerID, PackerHoursWorked packerHoursWorked) {
        this.packagingID = packagingID;
        this.packerID = packerID;
        this.packerHoursWorked = packerHoursWorked;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerHoursWorked getPackerHoursWorked() {
        return packerHoursWorked;
    }
}
