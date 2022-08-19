package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdatePackerDNI extends Command {

    private final PackagingID packagingID;
    private final PackerID packerID;
    private final PackerDNI packerDNI;

    public UpdatePackerDNI(PackagingID packagingID, PackerID packerID, PackerDNI packerDNI) {
        this.packagingID = packagingID;
        this.packerID = packerID;
        this.packerDNI = packerDNI;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerDNI getPackerDNI() {
        return packerDNI;
    }
}
