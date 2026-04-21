package collection.test.ex4;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart = new HashMap<>();


    public void add(Product product, int addQuantity) {

        Integer existingQuantity = cart.getOrDefault(product, 0);
        existingQuantity += addQuantity;

        cart.put(product, existingQuantity);

    }


    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> product : cart.entrySet()) {
            System.out.println("상품 : " + product.getKey() + " 수량: " + product.getValue());
        }

    }

    public void minus(Product product, int minusQuantity) {
        Integer existingQuantity = cart.getOrDefault(product, 0);
        Integer quantity = existingQuantity - minusQuantity;
        if(quantity <= 0){
            cart.remove(quantity);
        }else{
            cart.put(product, quantity);
        }

    }
}
