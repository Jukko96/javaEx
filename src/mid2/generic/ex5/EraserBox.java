package mid2.generic.ex5;

public class EraserBox <T>{
    public boolean instanceCheck(Object param){
//        return param instanceof T; // 불가능
        return  false;
    }

    public void create (){
//        return new T();// 불가능
    }

}
