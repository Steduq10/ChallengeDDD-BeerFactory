package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdatePackerUniform extends Command {

    private final PackagingID packagingID;
    private final PackerID packerID;
    private final PackerUniform packerUniform;

    public UpdatePackerUniform(PackagingID packagingID, PackerID packerID, PackerUniform packerUniform) {
        this.packagingID = packagingID;
        this.packerID = packerID;
        this.packerUniform = packerUniform;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public PackerID getPackerID() {
        return packerID;
    }

    public PackerUniform getPackerUniform() {
        return packerUniform;
    }
}
