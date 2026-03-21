package mid2.generic.test.ex2;

import mid2.generic.test.ex2.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    private T unit;

    public void in (T t){
        this.unit = t;
    }

    public T out (){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름: "+unit.getName() + " hp : "+unit.getHp());
    }
}
