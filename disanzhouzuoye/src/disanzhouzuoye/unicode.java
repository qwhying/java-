package disanzhouzuoye;
import java.util.*;

public class unicode {
	public static char Dec2Hex(int x) {
		if(x>=10) {
			return (char)('A'+(x-10));
		}
		else
			return (char)('0'+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String c=input.next();
		int x=(int)c.charAt(0);
		int x16;
		char[] uni=new char[4];
		while(x!=0) {
			int temp=x%16;
			x/=16;
			
		}
		System.out.println(x);
		

	}

}
