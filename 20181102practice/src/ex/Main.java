package ex;
import java.util.*;

import static ex.ex1.division;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入两个数，让他们进行除法运算：");
        a=input.nextInt();
        b=input.nextInt();
        try {
            int answer = division(a, b);
            System.out.println("The answer is "+answer);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(""+ex.getMessage());
        }
    }

}
