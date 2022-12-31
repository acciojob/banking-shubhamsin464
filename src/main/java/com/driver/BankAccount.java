package com.driver;

import javax.naming.InsufficientResourcesException;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;
    private Exception InsufficientResourcesException;

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double getMinBalance() {
        return minBalance;
    }


    public BankAccount(String name, double balance, double minBalance) {
          this.name=name;
          this.balance=balance;
          this.minBalance=minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
            balance=balance+amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(amount>balance){
            throw InsufficientResourcesException;
        }else{
            balance=balance-amount;
        }
    }

}