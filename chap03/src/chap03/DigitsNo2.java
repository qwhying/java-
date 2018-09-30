package chap03;
import java.util.*;

public class DigitsNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("整数值：");
		int n=input.nextInt();
		if(n<=-10||n>=10)
			System.out.println("是2位以上的数值。");
		else
			System.out.println("是不足2位的数值。");

	}

}
