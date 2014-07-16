package com.thoughtworks.accountbalance;

/**
 * Created by Lester on 2014-07-16.
 */
public class AccountBalance {
    private int balance;

    public AccountBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int i) {
        balance += i;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int i) {
        if(i <= balance) {
            balance -= i;
        }
    }
}
