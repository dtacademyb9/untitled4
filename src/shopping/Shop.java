package shopping;

import java.util.HashSet;
import java.util.Set;

class Shop {
    private Set<Customer> customers = new HashSet<>();

    public void addCustomer(Customer customer) {
        if (customers.add(customer)) {
            System.out.println("Customer added successfully.");
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void removeCustomer(String customerId) {
        customers.removeIf(customer -> customer.getCustomerId().equals(customerId));
    }

    public void viewCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getName());
        }
    }

    public Customer getCustomerById(String id){

        for (Customer customer : customers) {
            if(customer.getCustomerId().equals(id)){
                return customer;
            }
        }
        return null;
    }
}