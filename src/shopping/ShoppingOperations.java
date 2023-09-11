package shopping;

interface ShoppingOperations {
    void addProduct(Product product);
    void removeProduct(String productId);
    void viewCart();
}