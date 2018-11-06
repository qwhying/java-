package ex;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number of balls to drop:");
        Scanner input=new Scanner(System.in);
        int numberofballs=input.nextInt();//球的个数
        System.out.println("Enter the number of slots in the bean machine:");
        int numberofslots= input.nextInt();//槽的个数
        String[] paths=new String[numberofballs];//由L和R组成的字符串，表示对应的求经过的路径
        int[] slots=new int[numberofslots];//数组中存储每个槽中的球的个数
        for(int i=0;i<numberofballs;i++) {
            int[] numberofRandL={0,0};//数组numberofRandL中存储paths路径中R的个数和L的个数
            paths[i] = dropAbean(numberofslots - 1,numberofRandL);//numberofslots-1刚好是一个球所碰到的钉子个数
            System.out.println(paths[i]);
            slots[numberofRandL[0]]++;//路径中R的个数刚好表示下落的槽的位置

        }
        System.out.println(" ");
        int rows=maxbeans(slots);
        String[] barchart=new String[rows];//条形图，最后用来展示球的结果位置
        for(int i=rows;i>=1;i--)//打印条形图
        {
            barchart[i-1]="";
            for(int j=0;j<slots.length;j++) {
                if (slots[j] < i)
                    barchart[i - 1] += " ";
                else {
                    barchart[i - 1] += 'o';
                }
            }
            System.out.println(barchart[i-1]);
        }
    }
    public static String dropAbean(int slots,int[] nunberofRandL)
    {
        String answer="";
        Random rand=new Random();
        double temp;
        for(int i=0;i<slots;i++)
        {
            temp=rand.nextDouble();//temp是一个0到1的随机数，用来表示球向左和向右概率是0.5
            if(temp<0.5) {//向右
                answer += 'R';
                nunberofRandL[0]++;//R的计数器加一
            }
            else {//向左
                answer += 'L';
                nunberofRandL[1]++;//L的计数器加一
            }
        }
        return answer;
    }
    public static int maxbeans(int []slots)
    {
        int max=0;
        for(int i:slots)
        {
            if(i>max)
                max=i;
        }
        return max;
    }
}
