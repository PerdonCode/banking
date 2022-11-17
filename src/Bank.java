import java.util.ArrayList;

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
    public boolean addBranch(String name){
        Branch branch = new Branch(name);
        if (findBranch(name) != null){
            return false;
        }
        branches.add(branch);
        return true;
    }
    // check if customer already exist if not then add customer with the parameters
    public boolean addCustomer(String name_b, String name_c, double initialTransaction){
        for (Branch branch:branches) {
            if (branch.getName().equals(name_b)){
                return branch.newCustomer(name_c, initialTransaction);
            }
        }
        return false;
    }

// adding customer transaction

    public static boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, Double transaction) {
        for (Branch branch : branches) {
            if (branch.getName().equals(nameOfBranch)){
                return branch.addCustomerTransaction(nameOfCustomer, transaction);
            }
        }
        return false;
    }
    public boolean listCustomers(String name, boolean printTransactions){
        for (Branch branch: branches) {
            if (branch.getName().equals(name)){
                if (printTransactions){
                    System.out.println("Customer details for branch " + branch.getName());
                    for (Customer customer:branch.getCustomers()) {
                        System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer)+1) + "]");
                        System.out.println("Transactions");
                        for (Double transaction:customer.getTransactions()) {
                            System.out.println("[" + (customer.getTransactions().indexOf(transaction)+1) + "]  Amount " + transaction);
                        }
                    }
                    return true;
                }
                System.out.println("Customer details for branch " + branch.getName());
                for (Customer customer:branch.getCustomers()) {
                    System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer)+1) + "]");
                }
                return true;
            }
        }
        return false;
    }
}
