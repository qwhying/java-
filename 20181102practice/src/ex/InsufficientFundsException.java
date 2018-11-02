package ex;

import ex.bank;
/**
 * Created by Qwhying on 2018/11/2
 */
public class InsufficientFundsException extends Exception
{
    private double  dAmount;
    private double  balance;

    public void excepMessage(){
        System.out.println("您的取款金额为"+dAmount+"但是您账户余额仅为："+balance);
    }
    public InsufficientFundsException(double dAmount,double balance)
    {
        super("Insufficient Fund "+dAmount);
        this.dAmount=dAmount;
        this.balance=balance;
    }
}
