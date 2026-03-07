package mid2.genegic.test.ex1;

public class Container <T>{
    private T value;

    public Boolean isEmpty (){
        return value != null;
    }

    public T getItem (){
        return value;
    }
    public void setItem (T value){
        this.value = value;
    }

}
