package Production.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProductionEmployeName implements ValueObject {
    private final String value;

    public ProductionEmployeName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Employee name can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Beer type can't have less than 3 letters");
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
        ProductionEmployeName productionEmployeName = (ProductionEmployeName) o;
        return Objects.equals(value, productionEmployeName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
