package ex;

/**
 * Created by Qwhying on 2018/11/2
 */
public class ex1 {
    public static int division(int a,int b)throws ArithmeticException
    {
        if(b==0)
            throw new ArithmeticException("Divisor cannot be zero");
        return a/b;
    }
}
