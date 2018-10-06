package disanzhouzuoye;
import java.util.*;
public class practice7_31 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个有序列表：");
		System.out.println("Enter list1:");
		String temp=input.nextLine();
		String[] ss=temp.trim().split(" ");
		int[] list1=new int[ss.length];
		for(int i=0;i<ss.length;i++)
			list1[i]=Integer.parseInt(ss[i]);
		System.out.println("请输入两个有序列表：");
		System.out.println("Enter list2:");
		String temp2=input.nextLine();
		String[] ss2=temp2.trim().split(" ");
		int[] list2=new int[ss2.length];
		for(int i=0;i<ss2.length;i++)
			list2[i]=Integer.parseInt(ss2[i]);
		int[] list3=merge(list1,list2);
		System.out.print("The merged list is ");
		for(int i=0;i<list3.length;i++)
			System.out.print(list3[i]+" ");
	}
	public static int[] merge(int[] list1,int[] list2) {
		int length=list1.length+list2.length;
		int[] list3=new int[length];
		System.arraycopy(list1,0, list3, 0, list1.length);
		System.arraycopy(list2,0,list3,list1.length,list2.length);
		Arrays.sort(list3);
		return list3;
		
	}

}
