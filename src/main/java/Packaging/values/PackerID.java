package Packaging.values;

import Maintenance.values.ToolID;
import co.com.sofka.domain.generic.Identity;

public class PackerID extends Identity {
    public PackerID() {

    }

    private PackerID(String id) {
        super(id);
    }

    public static PackerID of(String id){
        return new PackerID(id);
    }
}
