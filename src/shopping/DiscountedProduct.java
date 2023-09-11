package shopping;

class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice() * discount / 100);
    }
}
