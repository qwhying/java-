package com.company;

/**
 * Created by Qwhying on 2018/10/16*/
import java.util.*;

import static java.lang.System.exit;

public class ATM{
    private int id=0;//用户id
    private double balance=0;//余额
    public ATM(int id,double ba)
    {
        this.id=id;
        balance=ba;
    }
    public double checkBalance()
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        if(balance<amount) {
            System.out.println("You don't have enough money on your account.");
        }
        else
        balance-=amount;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
}
