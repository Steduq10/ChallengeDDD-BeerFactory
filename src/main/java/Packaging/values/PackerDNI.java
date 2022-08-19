package Packaging.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PackerDNI implements ValueObject<String> {

    private final String value;

    public PackerDNI(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Packer DNI can't be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Packer DNI can't be less than 3 letters");
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
        PackerDNI packerDNI = (PackerDNI) o;
        return Objects.equals(value, packerDNI.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
