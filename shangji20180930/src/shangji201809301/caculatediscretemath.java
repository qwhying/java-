package shangji201809301;
import java.util.*;

public class caculatediscretemath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x,y;
		while(true) {
		     System.out.println("please input x:");
		     x=input.nextDouble();
		     System.out.println("please input y:");
		     y=input.nextDouble();
		     if((y/x)<=((y-x)/2))
		    	 System.out.println("true");
		     else 
		    	 System.out.println("false");
		}

	}

}
