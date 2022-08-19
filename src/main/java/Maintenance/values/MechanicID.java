package Maintenance.values;

import co.com.sofka.domain.generic.Identity;

public class MechanicID extends Identity {
    public MechanicID() {

    }

    private MechanicID(String id) {
        super(id);
    }

    public static MechanicID of(String id){
        return new MechanicID(id);
    }
}
