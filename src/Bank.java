import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private static String name;
    private static ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    //find brench and return when found.
    public static Branch findBranch(String nameBranch) {
        for (Branch branch : branches) {
            if (Branch.getName().equals(nameBranch)) {
                return branch;
            }
        }
        return null;
    }

    // checking if brench already exists if not then add brench
    public static boolean addBranch(String nameOfBranch) {
        if (Objects.equals(findBranch(nameOfBranch), nameOfBranch)) {
            System.out.println("Branch with " + Branch.getName() + " already exists.");
            return false;
        }
        Branch newBranch = new Branch(nameOfBranch);
        branches.add(newBranch);
        return true;
    }

    // check if customer already exist if not then add customer with the parameters
    public static boolean addCustomer(String nameOfBranch, String nameOfCustomer, Double transaction) {
        if (Objects.equals(findBranch(nameOfBranch), nameOfBranch)) {
            System.out.println("customer already exists");
            return false;
        } else {
            Customer customer = new Customer(nameOfCustomer, transaction);
            return true;
        }
    }

// adding customer transaction

    public static boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, Double transaction) {
        if (Objects.equals(findBranch(nameOfBranch), nameOfBranch)) {
            System.out.println("customer already exists");
            return false;
        } else {
            Branch.addCustomerTransaction(nameOfBranch, nameOfCustomer, transaction);
            return true;
        }
    }

    // -  listCustomers(), has two parameters of type String (name of the Branch),
    // boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise.
    // This method prints out a list of customers.
}
