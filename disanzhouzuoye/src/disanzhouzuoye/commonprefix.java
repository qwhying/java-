package disanzhouzuoye;
import java.util.*;

public class commonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first string:");
		String s1=input.nextLine();
		System.out.print("Enter the second string:");
		String s2=input.nextLine();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				if(i==0) {
					System.out.println(s1+" and "+s2+"have no common prefix");
					break;}
				else {
					System.out.println("The common prefix is "+s1.substring(0,i));
					break;}
			}
		}

	}

}
