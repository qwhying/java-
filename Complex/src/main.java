/**
 * Created by Qwhying on 2018/11/16
 */
public class main {
    public static void main(String[] args) {
        Complex a=new Complex();
        Complex b=new Complex(2,1);
        a.complexAdd(b);
        System.out.println(a.ToString());
    }
}
