package other.ebankapp.model;

import java.util.Objects;

public class Account {
    private String accountNumber;
    private String FullName;
    private String email;
    private String phone;
    private double balance;
    public Account() {
    }
    public Account(String accountNumber, String name, String email, String phone, double balance) {
        this.accountNumber = accountNumber;
        this.FullName = name;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setFullName(String name) {
        this.FullName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return FullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return String.format("AccountNO : %-5s FullName : %-5s Email : %-5s  Phone : %-5s  Balance : %-5.2f", this.accountNumber, this.FullName, this.email, this.phone, this.balance);
    }

    @Override
    public boolean equals(Object obj) {
        if( obj != null ) {
            Account other = (Account) obj;
            if( (this.accountNumber.equals(other.accountNumber)) || this.FullName.equals(other.FullName) || this.email.equals(other.email) ||this.phone.equals(phone))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, FullName, email, phone, balance);
    }
}

