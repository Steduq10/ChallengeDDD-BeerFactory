package Production.commands;

import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeName;
import Production.values.ProductionID;

public class UpdateEmployeName {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;

    public UpdateEmployeName(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeName getProductionEmployeName() {
        return productionEmployeName;
    }
}
