package HW7;

public class TransactionManager {
    private final Bank bank;

    public TransactionManager(Bank bank) {
        this.bank = bank;
    }

    public void process(ITransaction iTransaction) throws Exception {
        try {
            if (iTransaction.getAccount() == null) {
                throw new NullPointerException("рахунок не знайдений");
            }
            BankAccount account = bank.findAccount(iTransaction.getAccount().getAccountNumber());
            if (account == null) {
                throw new NullPointerException("рахунку не існує");
            }
            iTransaction.execute();
        } catch (IllegalArgumentException | NullPointerException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
