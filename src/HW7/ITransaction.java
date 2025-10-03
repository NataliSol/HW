package HW7;

public interface ITransaction {
    void execute() throws Exception;
    BankAccount getAccount();

}
