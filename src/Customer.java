import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transaction = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public static void addTransaction(double transaction){
        // add to what?

    }
}
