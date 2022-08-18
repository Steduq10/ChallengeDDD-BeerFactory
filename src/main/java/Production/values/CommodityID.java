package Production.values;

import co.com.sofka.domain.generic.Identity;

public class CommodityID extends Identity {
    public CommodityID() {

    }

    private CommodityID(String id) {
        super(id);
    }

    public static CommodityID of(String id){
        return new CommodityID(id);
    }
}
