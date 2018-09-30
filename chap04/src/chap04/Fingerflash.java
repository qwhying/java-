package chap04;
import java.util.*;

import java.util.Scanner;

public class Fingerflash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
	    int hand;
	    do {
	    	System.out.print("请选择手势（0石头/1剪刀/2布");
	    	hand=input.nextInt();
	    }while(hand<0||hand>2);
	    switch(hand) {
	    case 0:System.out.println("石头");break;
	    case 1:System.out.println("剪刀");break;
	    case 2:System.out.println("布");break;
	    }


	}

}
