package chap04;
import java.util.*;


public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x;
		do {
			System.out.print("������ʾ������ֵ:");
			x=input.nextInt();
		}while(x<=0);
		System.out.print("����������:");
		while(x>0) {
			System.out.print(x%10);
			x/=10;
		}
		System.out.println("��");

	}

}
