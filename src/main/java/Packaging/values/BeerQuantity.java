package Packaging.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BeerQuantity implements ValueObject<String> {
    private final String value;

    public BeerQuantity(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Beer Quantity can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Beer Quantity can't be less than 0 units");
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
        BeerQuantity beerQuantity = (BeerQuantity) o;
        return Objects.equals(value, beerQuantity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
