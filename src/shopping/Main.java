package shopping;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, my name is Alice.");
        System.out.println("I am a Java beginner.");
        System.out.println("I am excited to learn Java programming.");



        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");

        System.out.println("😊😊😊😊😊");
        System.out.println("😊      😊");
        System.out.println("😊😊😊😊😊");

        Shop shop = new Shop();
        shop.addCustomer(new Customer("C001", "Alice"));
        shop.addCustomer(new Customer("C002", "Bob"));
        shop.viewCustomers();

        System.out.println(shop.getCustomerById("C001"));

//        ShoppingCart cart = new ShoppingCart();

//        Product product1 = new Product("P001", "Product1", 100.00);
//        DiscountedProduct product2 = new DiscountedProduct("P002", "Product2", 150.00, 10);
//
//        cart.addProduct(product1);
//        cart.addProduct(product2);
//        cart.viewCart();
//
//        cart.removeProduct("P001");
//        cart.viewCart();
    }
}
