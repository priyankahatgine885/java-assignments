package other.ebankapp.main;
import other.ebankapp.exception.AccountNotFoundException;
import other.ebankapp.exception.InSufficientBalanceException;
import other.ebankapp.validation.Validator;

import java.util.*;

public class EBank {
    public static void main(String[] args) throws InSufficientBalanceException {
        int choice = 0;
        ListTest test = new ListTest();
        Scanner sc = new Scanner(System.in);
        test.setAccountList(new ArrayList<>());
        while ((choice = ListTest.menuList()) != 0) {
            switch (choice) {
                case 1:
                    test.addAccount();
                    break;
                case 2:
                    try {
                        System.out.println("Enter Account Number : ");
                        String accountNumber = sc.nextLine();
                        test.displayAnAccount(accountNumber);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        test.displayAllAccounts();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter Account Number");
                        String accountNumber = sc.nextLine();
                        if (test.removeAnAccount(accountNumber)) {
                            System.out.println("Account removed");
                            test.displayAllAccounts();
                        } else {
                            System.out.println("Account not removed");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Enter Account Number");
                        String accountNo = sc.nextLine();
                        test.withdraw(accountNo);
                    } catch (AccountNotFoundException | InSufficientBalanceException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Enter Account Number");
                        String accountNo = sc.nextLine();
                        test.deposit(accountNo);
                    } catch (AccountNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Enter the account you would like to transfer money from:");
                        String fromAccount = sc.nextLine();
                        System.out.println("Enter the account you would like to transfer money to:");
                        String toAccount = sc.nextLine();
                        System.out.println("Enter the amount of money you would like to transfer: $");
                        double moneyToTransfer = sc.nextDouble();
                        test.transfer(fromAccount, toAccount, moneyToTransfer);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 8:
                    try {
                        System.out.println("Enter Full Name For Searching : ");
                        String name = sc.nextLine();
                        int len = name.length();
                        if (len > 5) {
                            if (Validator.validateName(name)) {
                                if (test.searchAccountUsingName(name)) {
                                    System.out.println("Account is present");
                                } else {
                                    System.out.println("Search Failed.. Name Not Exist..");
                                }
                            } else {
                                System.out.println("Invalid full name");
                            }
                        } else {
                            System.out.println("less than 5 characters are not allowed");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Enter Email For Searching : ");
                        String email = sc.nextLine();
                        if (Validator.validateEmail(email)) {
                            if (test.searchAccountUsingEmail(email)) {
                                System.out.println("Email is present");
                            } else {
                                System.out.println("Search Failed..Email Not Exist..");
                            }
                        } else {
                            System.out.println("Invalid Email");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Enter Phone For Searching : ");
                        String phone = sc.nextLine();
                        int len = phone.length();
                        if (len >= 10) {
                            if (Validator.validatePhoneNumber(phone)) {
                                if (test.searchAccountUsingPhone(phone)) {
                                    System.out.println("Phone Number	:	" + phone);
                                } else {
                                    System.out.println("Search Failed..Phone Number Not Found..");
                                }
                            } else {
                                System.out.println("Invalid Phone Number");
                            }
                        } else {
                            System.out.println("less than 10 digits ara not allowed");
                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
            }
        }
    }
}
