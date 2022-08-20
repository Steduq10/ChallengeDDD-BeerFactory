package Maintenance.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MechanicHoursWorked implements ValueObject {


    private final String value;

    public MechanicHoursWorked(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Mechanic hours worked can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Mechanic hours worked can't have less than 0 hours");
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
        MechanicHoursWorked mechanicHoursWorked = (MechanicHoursWorked) o;
        return Objects.equals(value, mechanicHoursWorked.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
