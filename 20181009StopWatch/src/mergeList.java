
import java.util.Scanner;

public class mergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个有序数列，每行第一个数为数列元素个数。");
		System.out.println("Enter list1:");
		int n=input.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		System.out.println("Enter list2:");
		int m=input.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++)
			b[i]=input.nextInt();
		int[] c=merge(a,b);
		System.out.print("The merged list is ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}
	public static int[] merge(int[] list1,int[] list2)
	{
		int length=list1.length+list2.length;
		int[] list3=new int[length];
		for(int i=0,j=0,k=0;i+j<length&&k<length;k++)
		{
			if(i==list1.length)
			{
				list3[k]=list2[j];
				j++;
			}
			else if(j==list2.length) {
				list3[k]=list1[i];
				i++;
			}
			else if((list1[i]<=list2[j])&&(i<list1.length))
			{
				list3[k]=list1[i];
				i++;
			}
			else if((list2[j]<list1[i])&&(j<list2.length))
			{
				list3[k]=list2[j];
				j++;
			}
		}
		return list3;
	}

}
