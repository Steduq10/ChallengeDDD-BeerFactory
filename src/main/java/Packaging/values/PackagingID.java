package Packaging.values;


import co.com.sofka.domain.generic.Identity;

public class PackagingID extends Identity {

    public PackagingID() {

    }

    private PackagingID(String id) {
        super(id);
    }

    public static PackagingID of(String id){
        return new PackagingID(id);
    }
}
