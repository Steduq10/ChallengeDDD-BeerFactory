package Maintenance.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MechanicDNI implements ValueObject<String> {
    private final String value;

    public MechanicDNI(String value) {
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
        MechanicDNI mechanicDNI = (MechanicDNI) o;
        return Objects.equals(value, mechanicDNI.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
