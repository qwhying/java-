package gamblegame;
import java.util.*;

public class gamblegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random rand=new Random();
		double x;
		double q=0.5,p=0.6,delta=0.01;
		double Y=1/(1-q)-delta;//B赔率
		double X=1/q-delta;//A赔率
		double profit=0;
		for(int i=0;i<100;i++) {
			x=Math.random();//生成一个0到1的随机数
			if(x>=0.6)//B发生
			{
				profit+=Y*(1-p)-1;
			}
			else//A发生
			{
				profit+=X*p-1;
			}
			
		}
		System.out.println("the total profit is:"+profit);

	}

}
