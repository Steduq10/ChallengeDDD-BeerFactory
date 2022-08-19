package Packaging.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PackerName implements ValueObject<String> {

    private final String value;

    public PackerName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Packer Name can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Packer Name can't be less than 3 letters");
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
        PackerName packerName = (PackerName) o;
        return Objects.equals(value, packerName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
