package chap04;
import java.util.*;

public class Kazuate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner input=new Scanner(System.in);
		
		int no=rand.nextInt(100);
		System.out.println("��������Ϸ��ʼ!!");
		System.out.println("���һ��0~99���������");
		int x;
		do {
			System.out.print("�Ƕ����أ�");
			x=input.nextInt();
			if(x>no)
				System.out.println("���������С��");
			else if(x<no)
				System.out.println("��������ִ���");
		}while(x!=no);
		System.out.println("�ش���ȷ��");

	}

}
