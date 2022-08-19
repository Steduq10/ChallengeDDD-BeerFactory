package Production.events;

import Production.values.CommodityID;
import Production.values.CommodityQuantity;
import co.com.sofka.domain.generic.DomainEvent;

public class CommodityQuantityChanged extends DomainEvent {
    private final CommodityID commodityID;
    private final CommodityQuantity commodityQuantity;

    public CommodityQuantityChanged(CommodityID commodityID, CommodityQuantity commodityQuantity) {
        super("DDD.Production.CommodityQuantityChanged");
        this.commodityID = commodityID;
        this.commodityQuantity = commodityQuantity;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityQuantity getCommodityQuantity() {
        return commodityQuantity;
    }
}
