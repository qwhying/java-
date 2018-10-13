package third;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[6];
		a[0]=7;
		a[1]=1;
		a[2]=5;
		a[3]=3;
		a[4]=6;
		a[5]=4;
		System.out.println(solution(a));

	}
	public static int solution(int[] prices)
	{
		int n=prices.length;
		int profit=0;
		for(int i=0;i<n-1;i++)
		{
			if(prices[i+1]>prices[i]) {
				profit+=prices[i+1]-prices[i];
			}
			else
		    continue;
		}
		return profit;
	}

}
