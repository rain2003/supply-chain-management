package project.service;

import project.bean.Application;
import project.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class SellerService {

    public List<Product> getAllProducts() {
        return new ArrayList<>(Application.inventory.values());
    }

    public void sellProduct(Product product) {
        Application.inventory.put(product.getProductId(), product);
    }

    public void increaseProductQty(int productId, int quantity) {
        Product product = Application.inventory.get(productId);
        product.increaseQuantity(quantity);
        Application.inventory.put(productId, product);
    }

}
