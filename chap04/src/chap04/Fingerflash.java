package chap04;
import java.util.*;

import java.util.Scanner;

public class Fingerflash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
	    int hand;
	    do {
	    	System.out.print("��ѡ�����ƣ�0ʯͷ/1����/2��");
	    	hand=input.nextInt();
	    }while(hand<0||hand>2);
	    switch(hand) {
	    case 0:System.out.println("ʯͷ");break;
	    case 1:System.out.println("����");break;
	    case 2:System.out.println("��");break;
	    }


	}

}
