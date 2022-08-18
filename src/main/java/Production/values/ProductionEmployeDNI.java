package Production.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProductionEmployeDNI implements ValueObject {
    private final String value;

    public ProductionEmployeDNI(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Employee DNI can't be blank");
        }
        if(this.value.length() < 7){
            throw new IllegalArgumentException("The VO Beer type can't have less than 7 characters");
        }
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionEmployeDNI productionEmployeDNI = (ProductionEmployeDNI) o;
        return Objects.equals(value, productionEmployeDNI.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
