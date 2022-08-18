package Production.events;

import Production.values.ProductionEmployeDNI;
import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeName;
import Production.values.ProductionEmployeUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductionEmployeAdded extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeName productionEmployeName;
    private final ProductionEmployeDNI productionEmployeDNI;
    private final ProductionEmployeUniform productionEmployeUniform;

    public ProductionEmployeAdded( ProductionEmployeID productionEmployeID, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform) {
        super("DDD.Productions.ProductionEmployeAdded");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
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
