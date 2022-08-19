package Maintenance.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ToolBrand implements ValueObject<String> {
    private final String value;

    public ToolBrand(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Tool Brand can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Tool Brand can't have less than 3 characters");
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
        ToolBrand toolBrand = (ToolBrand) o;
        return Objects.equals(value, toolBrand.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
