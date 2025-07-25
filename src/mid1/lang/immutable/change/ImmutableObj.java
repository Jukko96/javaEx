package mid1.lang.immutable.change;

public class ImmutableObj {
    final private int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj immutableAdd (int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }
}
