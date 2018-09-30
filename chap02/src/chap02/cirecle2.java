package chap02;

import java.util.Scanner;

public class cirecle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.1416;
		Scanner stdIn=new Scanner(System.in);
		System.out.print("半径：");
		double r=stdIn.nextDouble();
		System.out.println("周长是"+2*PI*r+"。");
		System.out.println("面积是"+PI*r*r+"。");

	}

}
