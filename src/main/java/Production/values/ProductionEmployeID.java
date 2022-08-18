package Production.values;

import co.com.sofka.domain.generic.Identity;

public class ProductionEmployeID extends Identity {
    public ProductionEmployeID(){

    }

    private ProductionEmployeID(String id){
        super(id);
    }

    public static ProductionEmployeID of(String id){
        return new ProductionEmployeID(id);
    }
}
