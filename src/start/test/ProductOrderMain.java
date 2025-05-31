package start.test;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder carrot = new ProductOrder();
        carrot.amount = 5;
        carrot.productName = "당근";
        carrot.price = 1000;
        ProductOrder snack = new ProductOrder();
        snack.productName = "과자";
        snack.amount = 2;
        snack.price = 2000;
        ProductOrder water = new ProductOrder();
        water.productName = "물";
        water.amount = 2;
        water.price = 300;
        ProductOrder[] products = {carrot,snack, water};
        int totalPrice = 0;
        for (ProductOrder product : products) {
            System.out.println(product.price + "원인 물품 " +product.productName+"을(를) "+product.amount+"개 구매");
            totalPrice += product.price * product.amount;
        }
        System.out.println("총 금액" + totalPrice +" 원");
    }
}
