package Packaging.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PackerUniform implements ValueObject<String> {
    private final String value;

    public PackerUniform(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Packer Uniform can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Packer Uniform can't be less than 3 letters");
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
        PackerUniform packerUniform = (PackerUniform) o;
        return Objects.equals(value, packerUniform.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
