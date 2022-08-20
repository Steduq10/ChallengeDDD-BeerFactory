package Production.events;

import Production.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductionEmployeAdded extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;
    private final ProductionEmployeDNI productionEmployeDNI;
    private final ProductionEmployeUniform productionEmployeUniform;

    private final ProductionEmployeHoursWorked productionEmployeHoursWorked;

    public ProductionEmployeAdded( ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform, ProductionEmployeHoursWorked productionEmployeHoursWorked) {
        super("DDD.Productions.ProductionEmployeAdded");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
        this.productionEmployeHoursWorked = productionEmployeHoursWorked;
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
