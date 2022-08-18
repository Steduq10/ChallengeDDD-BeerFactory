package Production.commands;

import Production.values.*;

public class AddProductionEmploye {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;
    private final ProductionEmployeDNI productionEmployeDNI;
    private final ProductionEmployeUniform productionEmployeUniform;

    public AddProductionEmploye(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
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

    public ProductionEmployeDNI getProductionEmployeDNI() {
        return productionEmployeDNI;
    }

    public ProductionEmployeUniform getProductionEmployeUniform() {
        return productionEmployeUniform;
    }
}
