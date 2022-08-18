package Production.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CommodityQuantity implements ValueObject<String> {

    private final String value;

    public CommodityQuantity(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Commodity Quantity can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Commodity Quantity can't have less than 0 units");
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
        CommodityQuantity commodityQuantity = (CommodityQuantity) o;
        return Objects.equals(value, commodityQuantity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
