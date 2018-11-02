package ex;

/**
 * Created by Qwhying on 2018/11/2
 */
public class ExceptionDemo {
    public static void main(String[] args) {


        bank b = new bank(100);
        try {
            b.deposite(100);
            b.withdrawal(300);
        }
        catch (InsufficientFundsException ex) {
            ex.excepMessage();
            ex.toString();
        }
        finally {
            System.out.println("操作退出！");
        }

    }

}
