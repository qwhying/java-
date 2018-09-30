package chap02;

import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner stdIn= new Scanner(System.in);
        System.out.print("整数值：");
        int a=stdIn.nextInt();
        int b=-a;
        System.out.println(a+"的符号取反的值是"+b+"。");
	}

}
