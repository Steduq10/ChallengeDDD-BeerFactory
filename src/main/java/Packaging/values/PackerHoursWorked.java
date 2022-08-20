package Packaging.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PackerHoursWorked implements ValueObject<String> {

    private final String value;

    public PackerHoursWorked(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Packer hours worked can't be blank");
        }
        if(this.value.length() < 0){
            throw new IllegalArgumentException("The VO Packer hours worked can't be less than 0 hours");
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
        PackerHoursWorked packerHoursWorked = (PackerHoursWorked) o;
        return Objects.equals(value, packerHoursWorked.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
