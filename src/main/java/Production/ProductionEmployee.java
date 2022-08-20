package Production;

import Production.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ProductionEmployee extends Entity<ProductionEmployeID> {
    private  ProductionEmployeName productionEmployeName;
    private  ProductionEmployeDNI productionEmployeDNI;
    private  ProductionEmployeUniform productionEmployeUniform;

    private ProductionEmployeHoursWorked productionEmployeHoursWorked;


    public ProductionEmployee(ProductionEmployeID entityId, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform, ProductionEmployeHoursWorked productionEmployeHoursWorked) {
        super(entityId);
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
        this.productionEmployeHoursWorked = productionEmployeHoursWorked;
    }

    public void UpdateHoursWorked(ProductionEmployeHoursWorked productionEmployeHoursWorked){
        this.productionEmployeHoursWorked = Objects.requireNonNull(productionEmployeHoursWorked);
    }

    public void UpdateUniform(ProductionEmployeUniform productionEmployeUniform){
        this.productionEmployeUniform = Objects.requireNonNull(productionEmployeUniform);
    }

    public ProductionEmployeName productionEmployeName() {
        return productionEmployeName;
    }

    public ProductionEmployeDNI productionEmployeDNI() {
        return productionEmployeDNI;
    }

    public ProductionEmployeUniform productionEmployeUniform() {
        return productionEmployeUniform;
    }

    public ProductionEmployeHoursWorked productionEmployeHoursWorked() {
        return productionEmployeHoursWorked;
    }
}
