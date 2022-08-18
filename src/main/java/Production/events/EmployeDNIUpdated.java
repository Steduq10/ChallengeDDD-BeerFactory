package Production.events;

import Production.values.ProductionEmployeDNI;
import Production.values.ProductionEmployeID;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeDNIUpdated extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeDNI productionEmployeDNI;

    public EmployeDNIUpdated( ProductionEmployeID productionEmployeID, ProductionEmployeDNI productionEmployeDNI) {
        super("DDD.Production.EmployeDNIUpdated");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeDNI = productionEmployeDNI;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeDNI getProductionEmployeDNI() {
        return productionEmployeDNI;
    }
}
