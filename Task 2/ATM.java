public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : account.getTransactionHistory()) {
            System.out.println(transaction);
        }
    }
}

