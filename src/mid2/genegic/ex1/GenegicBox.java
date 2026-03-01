package mid2.genegic.ex1;

public class GenegicBox<T> {
    private T value;
    public void set(T value){
        this.value = value;
    }

    public T get (){
        return value;
    }
}
