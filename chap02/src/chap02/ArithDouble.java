package chap02;

import java.util.Scanner;

public class ArithDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��x��y���мӼ��˳�����");
		
		System.out.print("x��ֵ��");
		double x=stdIn.nextDouble();
		System.out.print("y��ֵ��");
		double y=stdIn.nextDouble();
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));
		System.out.println("x%y="+(x%y));
		

	}

}
