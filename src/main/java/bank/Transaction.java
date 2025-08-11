package bank;

public class Transaction {
    private String type;
    private double amount;
    private java.time.LocalDateTime date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = java.time.LocalDateTime.now();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public java.time.LocalDateTime getDate() {
        return date;
    }
}
