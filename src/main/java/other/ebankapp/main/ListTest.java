package other.ebankapp.main;
import other.ebankapp.exception.AccountNotFoundException;
import other.ebankapp.exception.InSufficientBalanceException;
import other.ebankapp.inteface.Operations;
import other.ebankapp.model.Account;

import java.util.List;
import java.util.Scanner;
public class ListTest implements Operations {
    private static Scanner sc = new Scanner(System.in);
    private static List<Account> accountList;
    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;

    }
    @Override
    public void addAccount() {
        Account account = new Account();
        if(accountList != null) {
            System.out.println("Enter Account Number :");
            account.setAccountNumber(String.valueOf(sc.nextInt()));
            sc.nextLine();
            System.out.println("Enter Full Name :");
            account.setFullName(sc.nextLine());
            System.out.println("Enter Email :");
            account.setEmail(sc.nextLine());
            System.out.println("Enter Phone :");
            account.setPhone(sc.nextLine());
            System.out.println("Enter Balance :");
            account.setBalance(sc.nextDouble());
            accountList.add(account);
        }
    }
    @Override
    public void displayAllAccounts() throws AccountNotFoundException {
        if (accountList != null) {
            for (Account accounts : accountList) {
                System.out.println(accounts.toString());
            }
        } else {
            throw new AccountNotFoundException("Account number not found.");
        }
    }
    public void displayAnAccount(String accountNumber) throws AccountNotFoundException {
        if (accountList != null) {
            for (Account arr : accountList) {
                if(arr != null) {
                    if (arr.getAccountNumber().equals(accountNumber)) {
                        System.out.println(arr.toString());
                        break;
                    }
                }
            }
            throw new AccountNotFoundException("Account Not Exist");
        }
    }
    @Override
    public boolean removeAnAccount(String accountNumber) {
        if (accountList != null) {
           Account account = new Account();
           account.setAccountNumber(accountNumber);
           if(accountList.contains(account)) {
                    accountList.remove(account);
                    return true;
            }else {
               System.out.println("Account Not exist");
           }
        }
        return false;
    }
    @Override
    public void withdraw(String accountNumber) throws InSufficientBalanceException, AccountNotFoundException {
        long amount;
        double balance;
        System.out.println("Enter Amount you Want to withdraw : ");
        amount = sc.nextLong();
        if (accountList != null) {
            for (Account account : accountList) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    if (account.getBalance() >= amount) {
                        balance = account.getBalance() - amount;
                        account.setBalance(balance);
                        System.out.println(account.toString());
                        break;
                    } else {
                        throw new InSufficientBalanceException("Less Balance..Transaction Failed..");
                    }
                }
                System.out.println("Account Number Not Found");
            }
        }
    }
    @Override
    public void deposit(String accountNumber) throws AccountNotFoundException {
        long amount;
        double balance;
        System.out.println("Enter Amount you Want to Deposit : ");
        amount = sc.nextLong();
        if (accountList != null) {
            for (Account account : accountList) {
                if (account != null) {
                    if (account.getAccountNumber().equals(accountNumber)) {
                        balance = account.getBalance() + amount;
                        account.setBalance(balance);
                        System.out.println(account.toString());
                        break;
                    }
                }
            }
        }
        System.out.println("Account Number Not Exist");
    }
    @Override
    public boolean searchAccountUsingName(String name) throws AccountNotFoundException {
        if (accountList != null) {
            for (Account account : accountList) {
                if (account != null) {
                    if (account.getName().equals(name)) {
                        System.out.println(account.toString());
                        return (true);
                    }
                }
            }
        } else {
            throw new AccountNotFoundException("Account Not exist");
        }
        return (false);
    }
    @Override
    public boolean searchAccountUsingEmail(String email) {
        if (accountList != null) {
            for (Account account : accountList) {
                if (account != null) {
                    if (account.getEmail().equals(email)) {
                        System.out.println(account.toString());
                        return (true);
                    } else {
                        System.out.println("Invalid Email");
                    }
                }
            }
        }
        return (false);
    }
    @Override
    public boolean searchAccountUsingPhone(String phone) {
        if (accountList != null) {
            for (Account account : accountList) {
                if (account != null) {
                    if (account.getPhone().equals(phone)) {
                        System.out.println(account.toString());
                        return (true);
                    }
                }
            }
        }
        return (false);
    }
    @Override
    public void transfer(String fromAccountNo, String toAccountNo, double amount) throws AccountNotFoundException, InSufficientBalanceException {
        if (accountList.size() >= 2) {
            for (Account account : accountList) {
                if (account.getAccountNumber().equals(fromAccountNo)) {
                    withdraw(fromAccountNo);
                }
                if (account.getAccountNumber().equals(toAccountNo)) {
                        deposit(toAccountNo);
                        System.out.println("Transaction Successful");
                        break;
                }
            }
        } else
            System.out.println("Cannot transfer.");
    }
    public static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Add Account");
        System.out.println("2.Display an Account");
        System.out.println("3.Display All Accounts");
        System.out.println("4.Remove an Account");
        System.out.println("5.withdraw");
        System.out.println("6.deposit");
        System.out.println("7.transfer");
        System.out.println("8.search account using name");
        System.out.println("9.search account using email");
        System.out.println("10.search account using phone");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
}
