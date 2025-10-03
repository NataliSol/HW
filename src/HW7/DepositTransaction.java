package HW7;

public class DepositTransaction implements ITransaction {
    BankAccount account;
    double amount;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getAccount() {
        return account;
    }
    @Override
    public void execute() {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
        } else {
            throw new IllegalArgumentException("Сума для поповнення повинна буде більша 0");
        }
    }
}




