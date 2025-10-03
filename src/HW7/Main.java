package HW7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount account_1 = new BankAccount("1", 52.0);
        BankAccount account_2 = new BankAccount("2", 100.0);
        BankAccount account_3 = new BankAccount("3", -4.0);
        BankAccount account_4 = new BankAccount("3", 0.0);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Bank bank = new Bank(accounts);
        bank.addAccount(account_1);
        bank.addAccount(account_2);
        bank.addAccount(account_3);
        bank.addAccount(account_4);
        TransactionManager transactionManager = new TransactionManager(bank);
        bank.displayAccountBalance("1");
        DepositTransaction depositTransaction_1 = new DepositTransaction(account_1, 80.00);
        DepositTransaction depositTransaction_2 = new DepositTransaction(account_1, 20.00);
        transactionManager.process(depositTransaction_1);
        bank.displayAccountBalance("1");
        transactionManager.process(depositTransaction_2);
        bank.displayAccountBalance("1");
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction(account_1, 12.00);
        transactionManager.process(withdrawalTransaction);
        bank.displayAccountBalance("1");
        WithdrawalTransaction withdrawalTransaction_2 = new WithdrawalTransaction(account_1, 00.00);
        WithdrawalTransaction withdrawalTransaction_3 = new WithdrawalTransaction(account_1, -30.00);
        transactionManager.process(withdrawalTransaction_2);
        bank.displayAccountBalance("1");
        transactionManager.process(withdrawalTransaction_3);
        bank.displayAccountBalance("1");
        bank.displayAccountBalance("1");
    }
}
