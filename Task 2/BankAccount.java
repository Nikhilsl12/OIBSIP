import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account opened with balance: " + initialBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            addTransaction("Withdrew: " + amount);
        } else {
            addTransaction("Failed withdrawal attempt: " + amount);
        }
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    private void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }
}
