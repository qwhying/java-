package shangji20180921;
import java.util.*;

public class qiufangchengzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		double a;
		System.out.print("b=:");
		a=input.nextDouble();
		double b;
		System.out.print("b=:");
		b=input.nextDouble();
		double c;
		System.out.print("c=:");
		c=input.nextDouble();
	    double deta=b*b-4*a*c;
		if(deta>0) {
			double x1=(-b+Math.sqrt(deta))/(2*a);
			double x2=(-b-Math.sqrt(deta))/(2*a);
			System.out.println("x1="+x1+" "+"x2="+x2);
		}
		else if(deta==0)
			System.out.println("x="+(-b/(2*a)));
		else
			System.out.println("无实数根");
		
		

		
	}

}
