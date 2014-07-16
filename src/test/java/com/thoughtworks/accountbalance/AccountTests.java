package com.thoughtworks.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private AccountBalance accountBalance;

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        accountBalance = new AccountBalance(100);

        accountBalance.deposit(50);

        assertThat(accountBalance.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        accountBalance = new AccountBalance(100);

        accountBalance.withdraw(50);

        assertThat(accountBalance.getBalance(), is(50));
    }

//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
