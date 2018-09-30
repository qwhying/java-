package chap03;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n>2)
			if(n%2==0)
				System.out.println("该值为偶数。");
			else
				System.out.println("该值为奇数。");
		else
			System.out.println("输入的不是正值");
		

	}

}
