package Production.commands;

import Production.values.*;
import co.com.sofka.domain.generic.Command;

public class AddCommodity extends Command {
    private final ProductionID productionID;
    private final CommodityID commodityID;
    private final CommodityName commodityName;
    private final CommodityQuantity commodityQuantity;
    private final CommodityPrice commodityPrice;


    public AddCommodity(ProductionID productionID, CommodityID commodityID, CommodityName commodityName, CommodityQuantity commodityQuantity, CommodityPrice commodityPrice) {
        this.productionID = productionID;
        this.commodityID = commodityID;
        this.commodityName = commodityName;
        this.commodityQuantity = commodityQuantity;
        this.commodityPrice = commodityPrice;
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

    public CommodityQuantity getCommodityQuantity() {
        return commodityQuantity;
    }

    public CommodityPrice getCommodityPrice() {
        return commodityPrice;
    }
}
