package chap03;

import java.util.*;
public class DigitsNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("整数值：");
		int n=input.nextInt();
		if(n==0)
			System.out.println("是0.");
		else if(n>=-9&&n<=9)
			System.out.println("是1位数值。");
		else
			System.out.println("是2位以上的数值。");

	}

}
