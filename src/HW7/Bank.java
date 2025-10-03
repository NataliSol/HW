package HW7;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

   public BankAccount findAccount(String accountNumber) {
        for (BankAccount number : accounts) {
            if (number.getAccountNumber().equals(accountNumber)) {
                return number;
            }
        }
        return null;
    }

    public void displayAccountBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.printf("Баланс рахунку: %.2f%n", account.getBalance());
        } else
            System.out.println("Aкаунт не знайдений");
    }

}
