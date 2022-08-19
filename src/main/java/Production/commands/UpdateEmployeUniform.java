package Production.commands;

import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeUniform;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class UpdateEmployeUniform extends Command {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeUniform productionEmployeUniform;

    public UpdateEmployeUniform(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeUniform productionEmployeUniform) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeUniform = productionEmployeUniform;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeUniform getProductionEmployeUniform() {
        return productionEmployeUniform;
    }
}
