package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdatePackerName extends Command {

    private final PackagingID packagingID;
    private final PackerID packerID;
    private final PackerName packerName;

    public UpdatePackerName(PackagingID packagingID, PackerID packerID, PackerName packerName) {
        this.packagingID = packagingID;
        this.packerID = packerID;
        this.packerName = packerName;
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
}
