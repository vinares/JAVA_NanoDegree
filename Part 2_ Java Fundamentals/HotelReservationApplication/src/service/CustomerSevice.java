package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerSevice {
    private static volatile CustomerSevice customerSevice = null;
    protected static Collection<Customer> customers;

    private CustomerSevice(){
        this.customers = new ArrayList<>();
    }

    public static CustomerSevice getInstance(){
        if (customerSevice == null) {
            synchronized (CustomerSevice.class) {
                if (customerSevice == null) {
                    customerSevice = new CustomerSevice();
                }
            }
        }
        return customerSevice;
    }

    public static void addCustomer(String firstName, String lastNmae, String email){
        customers.add(new Customer(firstName, lastNmae, email));
    }

    public static Customer getCustomer(String customerEmail){
        for (Customer customer : customers){
            if (customer.getEmail().equals(customerEmail)){
                return customer;
            }
        }
        return null;

    }

    public  static Collection<Customer> getAllCustomers(){
        return customers;
    }


}
