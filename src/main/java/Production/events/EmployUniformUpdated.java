package Production.events;

import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeUniform;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployUniformUpdated extends DomainEvent {
    private final ProductionEmployeID productionEmployeID;
    private final ProductionEmployeUniform productionEmployeUniform;

    public EmployUniformUpdated(ProductionEmployeID productionEmployeID, ProductionEmployeUniform productionEmployeUniform) {
        super("DDD.Productions.EmployUniformUpdated");
        this.productionEmployeID = productionEmployeID;
        this.productionEmployeUniform = productionEmployeUniform;
    }

    public ProductionEmployeID getProductionEmployeID() {
        return productionEmployeID;
    }

    public ProductionEmployeUniform getProductionEmployeUniform() {
        return productionEmployeUniform;
    }
}
