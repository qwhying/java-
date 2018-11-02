package ex;

/**
 * Created by Qwhying on 2018/11/2
 */
public class bank {
    private double balance=0;
    public void deposite(double dAmount)
    {
        balance+=dAmount;
    }
    public void withdrawal (double dAmount)throws InsufficientFundsException
    {
        if(dAmount>balance)
            throw new InsufficientFundsException(dAmount,balance);
        else
            balance-=dAmount;
    }
    public void show_balance()
    {
        System.out.println("The balance is :"+balance);
    }
    bank(double balance)
    {
        this.balance=balance;
    }
}
