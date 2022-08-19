package Packaging.values;

import Maintenance.values.ToolID;
import co.com.sofka.domain.generic.Identity;

public class BeerID extends Identity {

    public BeerID() {

    }

    private BeerID(String id) {
        super(id);
    }

    public static BeerID of(String id){
        return new BeerID(id);
    }
}
