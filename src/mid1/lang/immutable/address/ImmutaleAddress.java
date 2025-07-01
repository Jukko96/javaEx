package mid1.lang.immutable.address;

public class ImmutaleAddress {
    private final String value;

    public ImmutaleAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutaleAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
