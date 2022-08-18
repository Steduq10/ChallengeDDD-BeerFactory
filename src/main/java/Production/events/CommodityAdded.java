package Production.events;

import Production.values.CommodityID;
import Production.values.CommodityName;
import Production.values.CommodityPrice;
import Production.values.CommodityQuantity;
import co.com.sofka.domain.generic.DomainEvent;

public class CommodityAdded extends DomainEvent {
    private final CommodityID commodityID;
    private final CommodityName commodityName;
    private final CommodityQuantity commodityQuantity;
    private final CommodityPrice commodityPrice;

    public CommodityAdded(CommodityID commodityID, CommodityName commodityName, CommodityQuantity commodityQuantity, CommodityPrice commodityPrice) {
        super("DDD.Productions.CommodityAdded");
        this.commodityID = commodityID;
        this.commodityName = commodityName;
        this.commodityQuantity = commodityQuantity;
        this.commodityPrice = commodityPrice;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityName getCommodityName() {
        return commodityName;
    }

    public CommodityQuantity getCommodityQuantity() {
        return commodityQuantity;
    }

    public CommodityPrice getCommodityPrice() {
        return commodityPrice;
    }
}
