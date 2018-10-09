import java.util.*;
public class combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("请输入10个整数:");
		for(int i=0;i<10;i++)
			a[i]=input.nextInt();
		for(int i=0;i<10;i++)
			for(int j=i+1;j<10;j++)
				System.out.println(a[i]+" "+a[j]);
		

	}

}
