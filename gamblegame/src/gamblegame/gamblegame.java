package gamblegame;
import java.util.*;

public class gamblegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random rand=new Random();
		double x;
		double q=0.5,p=0.6,delta=0.01;
		double Y=1/(1-q)-delta;//B����
		double X=1/q-delta;//A����
		double profit=0;
		for(int i=0;i<100;i++) {
			x=Math.random();//����һ��0��1�������
			if(x>=0.6)//B����
			{
				profit+=Y*(1-p)-1;
			}
			else//A����
			{
				profit+=X*p-1;
			}
			
		}
		System.out.println("the total profit is:"+profit);

	}

}
