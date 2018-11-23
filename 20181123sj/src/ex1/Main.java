package ex1;

public class Main {
    public static int  jiecheng(int n)
    {
        if(n==0||n==1)
            return 1;
        else
            return n*jiecheng(n-1);
    }

    public static void main(String[] args) {
        int ans=0;
        for(int i=1;i<=10;i++) {
          //  System.out.println("" + jiecheng(i));
            ans+=jiecheng(i);
        }
        System.out.println(ans);
    }
}
