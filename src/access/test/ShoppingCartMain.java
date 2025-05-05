package access.test;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("상추",2000,2);
        shoppingCart.addItem("배추",4000,4);
        shoppingCart.displayItems();
    }
}
