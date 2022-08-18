package Production;

import Production.values.CommodityID;
import Production.values.CommodityName;
import Production.values.CommodityPrice;
import Production.values.CommodityQuantity;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Commodity extends Entity<CommodityID> {
    private CommodityName commodityName;
    private CommodityQuantity commodityQuantity;
    private CommodityPrice commodityPrice;

    public Commodity(CommodityID entityId, CommodityName commodityName, CommodityQuantity commodityQuantity, CommodityPrice commodityPrice) {
        super(entityId);
        this.commodityName = commodityName;
        this.commodityQuantity = commodityQuantity;
        this.commodityPrice = commodityPrice;
    }

    public void ChangeName(CommodityName commodityName){
        this.commodityName = Objects.requireNonNull(commodityName);
    }

    public void ChangeQuantity(CommodityQuantity commodityQuantity){
        this.commodityQuantity = Objects.requireNonNull(commodityQuantity);
    }

    public void ChangePrice(CommodityPrice commodityPrice){
        this.commodityPrice = Objects.requireNonNull(commodityPrice);
    }

    public CommodityName commodityName() {
        return commodityName;
    }

    public CommodityQuantity commodityQuantity() {
        return commodityQuantity;
    }

    public CommodityPrice commodityPrice() {
        return commodityPrice;
    }
}
