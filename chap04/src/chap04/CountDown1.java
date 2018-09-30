package chap04;
import java.util.*;

public class CountDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x;
		do {
			System.out.println("µ¹Êý¡£");
			x=input.nextInt();
		}while(x<=0);
		while(x>=0) {
			System.out.println(x);
			x--;
		}

	}

}
