package chap02;

import java.util.Scanner;

public class ArithInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner stdIn=new Scanner(System.in);
    System.out.println("对x和y进行加减乘除运算。");
    System.out.print("x的值:");
    int x=stdIn.nextInt();
    System.out.print("y的值:");
    int y=stdIn.nextInt();
    
    System.out.println("x+y="+(x+y));
    System.out.println("x-y="+(x-y));
    System.out.println("x*y="+(x*y));
    System.out.println("x/y="+(x/y));
    System.out.println("x%y="+(x%y));
    
	}

}
