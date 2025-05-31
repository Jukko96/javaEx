package start.extends1.test;

public class Item {
    public String name;
    private int price;
    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println("이름: "+this.name+", 가격 :"+this.price);
    }
    public int getPrice(){
        return this.price;
    }
}
