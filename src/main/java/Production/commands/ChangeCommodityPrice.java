package Production.commands;

import Production.values.CommodityID;
import Production.values.CommodityPrice;
import Production.values.ProductionID;

public class ChangeCommodityPrice {
    private final ProductionID productionID;
    private final CommodityID commodityID;
    private final CommodityPrice commodityPrice;

    public ChangeCommodityPrice(ProductionID productionID, CommodityID commodityID, CommodityPrice commodityPrice) {
        this.productionID = productionID;
        this.commodityID = commodityID;
        this.commodityPrice = commodityPrice;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityPrice getCommodityPrice() {
        return commodityPrice;
    }
}
