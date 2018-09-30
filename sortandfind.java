package shangji20180921;

public class sortandfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int a[]= {28,39,49,78,23};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int l=0;l<a.length;l++)
			System.out.print(a[l]+" ");
		System.out.print("\n");
		int low=0;
		int high=a.length-1;
		int find=49;
		int answer=-1000;
		while(high>=low) {
			int mid=(low+high)/2;
			if(find<a[mid])
				high=mid+1;
			else if(find==a[mid]) {
				answer=mid;
				break;}
			else
				low=mid+1;
			}
		if(answer>=0)
			System.out.println(find+"在第"+(answer+1)+"个。");
		else
			System.out.println("未找到");

	}

}
