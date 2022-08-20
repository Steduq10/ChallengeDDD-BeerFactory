package Production.commands;

import Production.values.*;
import co.com.sofka.domain.generic.Command;

public class AddProductionEmploye extends Command {
    private final ProductionID productionID;
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;
    private final ProductionEmployeDNI productionEmployeDNI;
    private final ProductionEmployeUniform productionEmployeUniform;

    private final ProductionEmployeHoursWorked productionEmployeHoursWorked;

    public AddProductionEmploye(ProductionID productionID, ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform, ProductionEmployeHoursWorked productionEmployeHoursWorked) {
        this.productionID = productionID;
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
        this.productionEmployeHoursWorked = productionEmployeHoursWorked;
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

    public ProductionEmployeHoursWorked getProductionEmployeHoursWorked() {
        return productionEmployeHoursWorked;
    }
}
