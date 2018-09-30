package chap04;
import java.util.*;

public class Kazuate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner input=new Scanner(System.in);
		
		int no=rand.nextInt(100);
		System.out.println("猜数字游戏开始!!");
		System.out.println("请猜一个0~99的随机数。");
		int x;
		do {
			System.out.print("是多少呢？");
			x=input.nextInt();
			if(x>no)
				System.out.println("比这个数字小呦");
			else if(x<no)
				System.out.println("比这个数字大呦");
		}while(x!=no);
		System.out.println("回答正确。");

	}

}
