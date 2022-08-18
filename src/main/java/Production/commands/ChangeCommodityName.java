package Production.commands;

import Production.values.CommodityID;
import Production.values.CommodityName;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class ChangeCommodityName extends Command {
    private final ProductionID productionID;
    private final CommodityID commodityID;
    private final CommodityName commodityName;

    public ChangeCommodityName(ProductionID productionID, CommodityID commodityID, CommodityName commodityName) {
        this.productionID = productionID;
        this.commodityID = commodityID;
        this.commodityName = commodityName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public CommodityID getCommodityID() {
        return commodityID;
    }

    public CommodityName getCommodityName() {
        return commodityName;
    }
}
