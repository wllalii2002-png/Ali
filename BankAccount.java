public abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public double getBalance() { return balance; }

    public void show() {
        System.out.println(accountNumber + ": " + balance);
    }
}