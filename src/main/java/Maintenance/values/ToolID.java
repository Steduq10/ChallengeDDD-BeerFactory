package Maintenance.values;

import Production.values.CommodityID;
import co.com.sofka.domain.generic.Identity;

public class ToolID extends Identity {
    public ToolID() {

    }

    private ToolID(String id) {
        super(id);
    }

    public static ToolID of(String id){
        return new ToolID(id);
    }
}
