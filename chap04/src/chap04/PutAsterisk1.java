package chap04;
import java.util.*;
public class PutAsterisk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("要显示多少个*呢？");
		int n=input.nextInt();
		int i=0;
		while(i<n) {
			System.out.print('*');
			i++;
		}
		System.out.println();

	}

}
