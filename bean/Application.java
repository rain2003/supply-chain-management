package project.bean;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static Map<Integer, Product> inventory = new HashMap<>();

    public static Map<Integer, Buyer> buyers = new HashMap<>();

    public static Map<Integer, Seller> sellers = new HashMap<>();

    public Application() {

        Product product1 = new Product("shoes", 10, 100.0);
        inventory.put(product1.getProductId(), product1);

        Product product2 = new Product("cap", 20, 50.0);
        inventory.put(product2.getProductId(), product2);

    }
}
