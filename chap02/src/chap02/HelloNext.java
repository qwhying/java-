package chap02;

import java.util.Scanner;

public class HelloNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.print("您的姓名是：");
		String s=stdIn.next();
		System.out.println("你好"+s+"先生。");

	}

}
