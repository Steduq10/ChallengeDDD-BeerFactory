package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class AddPacker extends Command {
    private final PackagingID packagingID;
    private final PackerID packerID;
    private final PackerDNI packerDNI;
    private final PackerName packerName;
    private final PackerUniform packerUniform;

    private final PackerHoursWorked packerHoursWorked;

    public AddPacker(PackagingID packagingID, PackerID packerID, PackerName packerName,PackerDNI packerDNI, PackerUniform packerUniform, PackerHoursWorked packerHoursWorked) {
        this.packagingID = packagingID;
        this.packerID = packerID;
        this.packerName = packerName;
        this.packerDNI = packerDNI;
        this.packerUniform = packerUniform;
        this.packerHoursWorked = packerHoursWorked;

    }

    public PackagingID getPackagingID() {
        return packagingID;
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
