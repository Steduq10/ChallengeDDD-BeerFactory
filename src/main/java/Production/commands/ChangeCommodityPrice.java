package Production.commands;

import Production.values.CommodityID;
import Production.values.CommodityPrice;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class ChangeCommodityPrice extends Command {
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
