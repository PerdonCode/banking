import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private static String name;
    private static ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public static String getName() {
        return name;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static boolean newCustomer(String nameOfCustomer, Double transaction){
        if (findCustomer(nameOfCustomer)!= null){
            Customer customer = new Customer(nameOfCustomer, transaction);
            customers.add(customer);
            return true;
        }
        return false;
    }
    public static boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, Double transaction){
        if (findCustomer(nameOfCustomer) != null){

        }
    }

    public static Customer findCustomer(String nameOfCustomer){
        for (Customer customer : customers){
            if (customer.getName().equals(nameOfCustomer)){
                return customer;
            }
        }
        return null;
    }
}
