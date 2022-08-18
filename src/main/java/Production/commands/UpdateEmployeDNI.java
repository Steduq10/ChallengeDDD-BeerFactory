package Production.commands;

import Production.values.ProductionEmployeDNI;
import Production.values.ProductionEmployeID;
import Production.values.ProductionID;

public class UpdateEmployeDNI {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeDNI productionEmployeDNI;

    public UpdateEmployeDNI(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeDNI productionEmployeDNI) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeDNI = productionEmployeDNI;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeDNI getProductionEmployeDNI() {
        return productionEmployeDNI;
    }
}
