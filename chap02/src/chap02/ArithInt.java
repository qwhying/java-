package chap02;

import java.util.Scanner;

public class ArithInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner stdIn=new Scanner(System.in);
    System.out.println("��x��y���мӼ��˳����㡣");
    System.out.print("x��ֵ:");
    int x=stdIn.nextInt();
    System.out.print("y��ֵ:");
    int y=stdIn.nextInt();
    
    System.out.println("x+y="+(x+y));
    System.out.println("x-y="+(x-y));
    System.out.println("x*y="+(x*y));
    System.out.println("x/y="+(x/y));
    System.out.println("x%y="+(x%y));
    
	}

}