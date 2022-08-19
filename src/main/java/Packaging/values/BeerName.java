package Packaging.values;

import Maintenance.values.ToolName;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BeerName implements ValueObject<String> {

    private final String value;

    public BeerName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Beer Name can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Beer Name can't have less than 3 letters");
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
        BeerName beerName = (BeerName) o;
        return Objects.equals(value, beerName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
