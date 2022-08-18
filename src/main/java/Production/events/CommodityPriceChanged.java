package Production.events;

import Production.values.CommodityID;
import Production.values.CommodityPrice;
import co.com.sofka.domain.generic.DomainEvent;

public class CommodityPriceChanged extends DomainEvent {
    private final CommodityID commodityID;
    private final CommodityPrice commodityPrice;

    public CommodityPriceChanged( CommodityID commodityID, CommodityPrice commodityPrice) {
        super("DDD.Production.CommodityPriceChanged");
        this.commodityID = commodityID;
        this.commodityPrice = commodityPrice;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityPrice getCommodityPrice() {
        return commodityPrice;
    }
}
