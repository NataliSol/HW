package HW7;

public class WithdrawalTransaction implements ITransaction {
    BankAccount account;
    double amount;

    public WithdrawalTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() throws Exception {
        if (amount < 0) {
            throw new IllegalArgumentException("сума зняття не може бути меньша нуля");
        } else if (amount > account.getBalance()) {
            throw new InsufficientFundsException("сума зняття більша ніж баланс");
        } else if (amount >= 0) {
            account.setBalance(account.getBalance() - amount);
        }
    }

    @Override
    public BankAccount getAccount() {
        return account;
    }
}
