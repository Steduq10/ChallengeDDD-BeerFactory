package Maintenance.values;

import Production.values.CommodityName;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MechanicName implements ValueObject<String> {

    private final String value;

    public MechanicName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Mechanic Name can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Mechanic Name can't have less than 3 letters");
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
        MechanicName mechanicName = (MechanicName) o;
        return Objects.equals(value, mechanicName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
