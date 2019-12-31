package entities;

import java.util.Objects;

public class CustomerWallet {
    private String phoneNo;
    private String name;
    private double balance;

    public CustomerWallet() {
    }

    public CustomerWallet(String phoneNo, String name, double balance) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.balance = balance;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof CustomerWallet)) {
            return false;
        }
        CustomerWallet that = (CustomerWallet) o;
        return that.phoneNo.equals(this.phoneNo);
    }

    @Override
    public int hashCode() {
        return phoneNo.hashCode();
    }
}




