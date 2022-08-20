package Production.events;

import Production.values.ProductionEmployeHoursWorked;
import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeName;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeHoursWorkedUpdated extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeHoursWorked productionEmployeHoursWorked;

    public EmployeHoursWorkedUpdated(ProductionEmployeID productionEmployeID, ProductionEmployeHoursWorked productionEmployeHoursWorked) {
        super("DDD.Production.EmployeHoursWorkedUpdated");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeHoursWorked = productionEmployeHoursWorked;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeHoursWorked getProductionEmployeHoursWorked() {
        return productionEmployeHoursWorked;
    }
}
