package chap03;
import java.util.*;

public class FingerFlash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ�����ƣ�0ʯͷ/1����/2��");
	    int hand=input.nextInt();
	    switch(hand) {
	    case 0:System.out.println("ʯͷ");break;
	    case 1:System.out.println("����");break;
	    case 2:System.out.println("��");break;
	    }

	}

}
