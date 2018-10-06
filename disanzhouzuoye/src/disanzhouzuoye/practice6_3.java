package disanzhouzuoye;
import java.util.*;

public class inverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("please input a int number:");
		int x=input.nextInt();
		if(ispalindrome(x))
		  System.out.println("It's a palindrome.");
		else
			System.out.println("It's not a palindrome.");
		
	}
	public static int reverse(int number) {
		int answer=0;
		while(number>0) {
			answer=answer*10+number%10;
			number/=10;
		}
		return answer;
	}
	public static boolean ispalindrome(int number) {
		if(number==reverse(number))
			return true;
		else return false;
	}

}
