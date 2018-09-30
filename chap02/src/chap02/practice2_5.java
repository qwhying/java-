package chap02;

import java.util.Scanner;

public class practice2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("求三角形的面积");
		System.out.print("底：");
		double base=stdIn.nextDouble();
		System.out.print("高：");
		double height=stdIn.nextDouble();
		System.out.println("面积是："+(base*height)/2);

	}

}
