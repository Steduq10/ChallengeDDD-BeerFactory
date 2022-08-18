package Production.values;

import co.com.sofka.domain.generic.Identity;

public class ProductionID extends Identity {
    public ProductionID(){

    }

    private ProductionID(String id){
        super(id);
    }

    public static ProductionID of(String id){
        return new ProductionID(id);
    }
}
