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

    private BankAccount findAccount(String accountNumber) {
        for (BankAccount number : accounts) {
            if (number.getAccountNumber().equals(accountNumber)) {
                return number;
            }
        }
        return null;
    }

    public void processWithdrawal(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);
            if (account != null) {
                account.withdraw(amount);
            } else
                throw new NullPointerException("Данного рахунку не існує");
        } catch (InsufficientFundsException e) {
            System.out.println("Коштів недостатньо");
        } catch (IllegalArgumentException e) {
            System.out.println("суммаэ не може бути меньше 0");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void processDeposit(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);
            if (account != null) {
                account.deposit(amount);
            } else
                throw new NullPointerException("Данного рахунку не існує");
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAccountBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.println(account.getBalance());
        } else
            System.out.println("аккаут не знайдений");
    }

}
