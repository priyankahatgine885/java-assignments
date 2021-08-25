package other.savingaccount.model;

public class SavingsAccount {
	    public static float annualInterestRate;
	    private int savingsBalance;
	    public SavingsAccount(){

	    }
		public SavingsAccount(int savingsBalance) {
			
			this.savingsBalance = savingsBalance;
		}
		public static float getAnnualInterestRate() {
			return annualInterestRate;
		}
		public static void setAnnualInterestRate(float annualInterestRate) {
			float result;
			if(annualInterestRate > 0) {
				result = annualInterestRate / 100;
			SavingsAccount.annualInterestRate = result;
			}
		}
		public int getSavingsBalance() {
			return savingsBalance;
		}
		public void setSavingsBalance(int savingsBalance) {
			this.savingsBalance = savingsBalance;
		}
		@Override
		public String toString() {
			return "SavingsAccount [savingsBalance=" + savingsBalance + "]";
		}
	    


}
