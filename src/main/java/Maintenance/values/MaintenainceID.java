package Maintenance.values;

import co.com.sofka.domain.generic.Identity;

public class MaintenainceID extends Identity {
    public MaintenainceID() {

    }

    private MaintenainceID(String id) {
        super(id);
    }

    public static MaintenainceID of(String id){
        return new MaintenainceID(id);
    }
}
