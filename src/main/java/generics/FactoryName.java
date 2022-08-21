package generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FactoryName implements ValueObject<String> {
    private final String value;

    public FactoryName(String value) {
        if(value.isBlank()){
            throw new IllegalArgumentException("The VO factory name cant be blank");
        }
        if(value.length() < 3){
            throw new IllegalArgumentException("The VO factory name cant have less than 3 letters");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactoryName factoryName = (FactoryName) o;
        return Objects.equals(value, factoryName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
