package disanzhouzuoye;
import java.util.*;

public class practice6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please input your Password:");
		String key=input.nextLine();
		if(key.length()<8)
			System.out.println("Invalid Password");
		else {
			int count=0;
			for(int i=0;i<key.length();i++)
			{
				if((Character.isDigit(key.charAt(i))==false)&&(Character.isLetter(key.charAt(i))==false)) {
					System.out.println("Invalid Password");
					break;
				}
				else if(Character.isDigit(key.charAt(i))==true)
					count++;
				
			}
			if(count<2)
				System.out.println("Invalid Password");
			else
				System.out.println("Valid Password");
		}

	}

}
