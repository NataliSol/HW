package HW7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
        bank.processDeposit("1", 10.0); // внесення коштів успішне
        bank.displayAccountBalance("1");
        bank.processWithdrawal("1", 60.0);
        bank.displayAccountBalance("1");
        bank.processWithdrawal("1", 10.0);
        bank.displayAccountBalance("1");
        bank.processWithdrawal("1", -10.0);
        bank.displayAccountBalance("1");
        bank.processWithdrawal("ооо", 10.0);
        bank.displayAccountBalance("1");
        bank.processWithdrawal("8888", -10.0);

    }
}
