package chap02;

import java.util.Scanner;

public class ArithDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("对x和y进行加减乘除运算");
		
		System.out.print("x的值：");
		double x=stdIn.nextDouble();
		System.out.print("y的值：");
		double y=stdIn.nextDouble();
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));
		System.out.println("x%y="+(x%y));
		

	}

}
