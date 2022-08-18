package Production.events;

import Production.values.CommodityID;
import Production.values.CommodityName;
import co.com.sofka.domain.generic.DomainEvent;

public class CommodityNameChanged extends DomainEvent {
    private final CommodityID commodityID;
    private final CommodityName commodityName;

    public CommodityNameChanged( CommodityID commodityID, CommodityName commodityName) {
        super("DDD.Productions.CommodityNameChanged");
        this.commodityID = commodityID;
        this.commodityName = commodityName;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityName getCommodityName() {
        return commodityName;
    }
}
