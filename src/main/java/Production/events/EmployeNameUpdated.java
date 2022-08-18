package Production.events;

import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeName;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeNameUpdated extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;

    public EmployeNameUpdated( ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName) {
        super("DDD.Production.EmployeNameUpdated");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeName getProductionEmployeName() {
        return productionEmployeName;
    }
}
