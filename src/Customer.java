import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transaction = new ArrayList<>();
    }
    public void addTransaction(double transaction){
        this.transaction.add(transaction);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
