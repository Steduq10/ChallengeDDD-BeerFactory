package Production;

import Production.values.ProductionEmployeDNI;
import Production.values.ProductionEmployeID;
import Production.values.ProductionEmployeName;
import Production.values.ProductionEmployeUniform;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ProductionEmployee extends Entity<ProductionEmployeID> {
    private  ProductionEmployeName productionEmployeName;
    private  ProductionEmployeDNI productionEmployeDNI;
    private  ProductionEmployeUniform productionEmployeUniform;


    public ProductionEmployee(ProductionEmployeID entityId, ProductionEmployeName productionEmployeName, ProductionEmployeDNI productionEmployeDNI, ProductionEmployeUniform productionEmployeUniform) {
        super(entityId);
        this.productionEmployeName = productionEmployeName;
        this.productionEmployeDNI = productionEmployeDNI;
        this.productionEmployeUniform = productionEmployeUniform;
    }

    public void UpdateName(ProductionEmployeName productionEmployeName){
        this.productionEmployeName = Objects.requireNonNull(productionEmployeName);
    }

    public void UpdateDNI(ProductionEmployeDNI productionEmployeDNI){
        this.productionEmployeDNI = Objects.requireNonNull(productionEmployeDNI);
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
}
