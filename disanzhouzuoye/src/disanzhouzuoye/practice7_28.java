package disanzhouzuoye;
import java.util.*;

public class practice7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please input 10 numbers");
		int[] tennum=new int[10];
		for(int i=0;i<10;i++) {
			tennum[i]=input.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++)
			{
				System.out.print(tennum[i]+","+tennum[j]+" ");
			}
			System.out.println("");
		}

	}

}
