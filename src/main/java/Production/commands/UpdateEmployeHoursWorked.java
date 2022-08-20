package Production.commands;

import Production.values.ProductionEmployeHoursWorked;
import Production.values.ProductionEmployeID;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.Command;

public class UpdateEmployeHoursWorked extends Command {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeHoursWorked productionEmployeHoursWorked;

    public UpdateEmployeHoursWorked(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeHoursWorked productionEmployeHoursWorked) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeHoursWorked = productionEmployeHoursWorked;
    }

    public ProductionID getProductionID() {
        return productionID;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeHoursWorked getProductionEmployeHoursWorked() {
        return productionEmployeHoursWorked;
    }
}
