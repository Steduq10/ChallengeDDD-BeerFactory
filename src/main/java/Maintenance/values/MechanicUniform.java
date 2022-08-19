package Maintenance.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MechanicUniform implements ValueObject<String> {
    private final String value;

    public MechanicUniform(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Mechanic DNI can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Mechanic DNI can't have less than 0 characters");
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
        MechanicUniform mechanicUniform = (MechanicUniform) o;
        return Objects.equals(value, mechanicUniform.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
