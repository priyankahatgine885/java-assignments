package other.savingaccount;
import other.savingaccount.model.SavingsAccount;
/*
Q. (Savings Account Class)
Create class SavingsAccount.
Use a static variable annualInterestRate to store the annual
interest rate for all account holders. Each object of the class
contains a private instance variable savingsBalance indicating
the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly
interest by multiplying the savingsBalance by annualInterestRate
divided by 12—this interest should be added to savings-Balance.
Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value. Write a program to test class
SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00,
respectively. Set annualInterestRate to 4%, then calculate the
monthly interest for each of 12 months and print the new balances for both savers.
Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
 */
public class App {
    public static void main(String[] args) {
        SavingsAccount saver1  = new SavingsAccount(2000);
        SavingsAccount saver2  = new SavingsAccount(3000);
        SavingsAccount.setAnnualInterestRate(4);
        System.out.println(SavingsAccount.getAnnualInterestRate());
        float saver1ForMonthlyInterestRate = calculateMonthlyInterestRate(saver1, SavingsAccount.getAnnualInterestRate());
        System.out.println("MonthlyInterestRate :" + saver1ForMonthlyInterestRate);
        float saver2ForMonthlyInterestRate = calculateMonthlyInterestRate(saver2, SavingsAccount.getAnnualInterestRate());
        System.out.println("MonthlyInterestRate :" +saver2ForMonthlyInterestRate);
        modifyInterestRate(5f);
    }
    private static float calculateMonthlyInterestRate(SavingsAccount savingBalance, float annualInterestRate) {
        float monthlyInterestRate;
        monthlyInterestRate = ((savingBalance.getSavingsBalance() * annualInterestRate) / 12) + savingBalance.getSavingsBalance();
        return monthlyInterestRate;
    }
    private static void modifyInterestRate(float newInterestRate) {
        if(newInterestRate >= 0.0f)
            SavingsAccount.annualInterestRate = newInterestRate;
        else
            throw new IllegalArgumentException("interest rate must be >= 0.0f");
    }
}
