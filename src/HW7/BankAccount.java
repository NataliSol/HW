package HW7;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Сума для поповнення повинна буде більша 0");

        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("сума зняття не може бути меньша нуля>");
        } else if (amount > balance) {
            throw new InsufficientFundsException("сума зняття більша ніж баланс");
        } else if (amount >= 0) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}