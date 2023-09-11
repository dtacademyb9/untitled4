package shopping;

import java.util.LinkedList;
import java.util.List;

class ShoppingCart implements ShoppingOperations {
    private List<Product> cartItems = new LinkedList<>();
    private Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void addProduct(Product product) {
        cartItems.add(product);
    }

    @Override
    public void removeProduct(String productId) {
        cartItems.removeIf(product -> product.getProductId().equals(productId));
    }

    @Override
    public void viewCart() {
        System.out.println("Shopping cart of " + customer.getName());
        for (Product product : cartItems) {
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}
