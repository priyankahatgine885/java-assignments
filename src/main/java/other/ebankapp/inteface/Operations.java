package other.ebankapp.inteface;
import other.ebankapp.exception.AccountNotFoundException;
import other.ebankapp.exception.InSufficientBalanceException;

public interface Operations {
    void addAccount();
    void displayAnAccount(String accountNumber) throws AccountNotFoundException;
    void displayAllAccounts() throws AccountNotFoundException;
    boolean removeAnAccount(String accountNumber);
    void withdraw(String accountNumber) throws InSufficientBalanceException, AccountNotFoundException;
    void deposit(String accountNumber) throws AccountNotFoundException;
    void transfer(String fromAccountNo, String toAccountNo, double amount) throws AccountNotFoundException, InSufficientBalanceException;
    boolean searchAccountUsingName(String name) throws AccountNotFoundException;
    boolean searchAccountUsingEmail(String email);
    boolean searchAccountUsingPhone(String phone);
}
