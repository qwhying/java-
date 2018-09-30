package chap03;
import java.util.*;

public class FingerFlash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请选择手势（0石头/1剪刀/2布");
	    int hand=input.nextInt();
	    switch(hand) {
	    case 0:System.out.println("石头");break;
	    case 1:System.out.println("剪刀");break;
	    case 2:System.out.println("布");break;
	    }

	}

}
