package Production.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CommodityPrice implements ValueObject {

    private final String value;

    public CommodityPrice(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Commodity price can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Commodity price can't have less than 0");
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
        CommodityPrice commodityPrice = (CommodityPrice) o;
        return Objects.equals(value, commodityPrice.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
