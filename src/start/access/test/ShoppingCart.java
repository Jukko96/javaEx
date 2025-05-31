package start.access.test;

public class ShoppingCart {
    Item[] cart = new Item[10];
    int arrayCount;

    public void addItem (String name, int price, int amount){
        if(arrayCount < cart.length){
            Item item = new Item(name, price, amount);
            cart[arrayCount++] = item;
        }else{
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }
    public void displayItems(){
        int totalPrice = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : cart) {
            int sumPrice = item.price * item.amount;
            totalPrice += sumPrice;
            System.out.println("상품명 : "+item.name+", 합계 : "+ sumPrice);
        }
        System.out.println("전체 가격 합 : "+totalPrice);

    }
}

class Item {
    String name;
    int price;
    int amount;
    Item(String name, int price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
