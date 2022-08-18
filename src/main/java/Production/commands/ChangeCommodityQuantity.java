package Production.commands;

import Production.values.CommodityID;
import Production.values.CommodityQuantity;
import Production.values.ProductionID;

public class ChangeCommodityQuantity {
    private final ProductionID productionID;
    private final CommodityID commodityID;
    private final CommodityQuantity commodityQuantity;

    public ChangeCommodityQuantity(ProductionID productionID, CommodityID commodityID, CommodityQuantity commodityQuantity) {
        this.productionID = productionID;
        this.commodityID = commodityID;
        this.commodityQuantity = commodityQuantity;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityQuantity getCommodityQuantity() {
        return commodityQuantity;
    }
}
