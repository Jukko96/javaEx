package mid2.genegic.test.ex1;

public class Pair<First, Second> {
    private First first;
    private Second second;
    public void setFirst(First first) {
        this.first = first;
    }
    public void setSecond (Second second){
        this.second = second;
    }

    public First getFirst() {
        return this.first;
    }

    public Second getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
