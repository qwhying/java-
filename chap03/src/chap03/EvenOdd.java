package chap03;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n>2)
			if(n%2==0)
				System.out.println("��ֵΪż����");
			else
				System.out.println("��ֵΪ������");
		else
			System.out.println("����Ĳ�����ֵ");
		

	}

}
