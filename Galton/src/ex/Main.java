package ex;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number of balls to drop:");
        Scanner input=new Scanner(System.in);
        int numberofballs=input.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int numberofslots= input.nextInt();
        String[] paths=new String[numberofballs];
        int[] slots=new int[numberofslots];
        for(int i=0;i<numberofballs;i++) {
            int[] numberofRandL={0,0};
            paths[i] = dropAbean(numberofslots - 1,numberofRandL);
            System.out.println(paths[i]);
            slots[numberofRandL[0]]++;

        }

    }
    public static String dropAbean(int slots,int[] nunberofRandL)
    {
        String answer="";
        Random rand=new Random();
        double temp;
        for(int i=0;i<slots;i++)
        {
            temp=rand.nextDouble();
            if(temp<0.5) {
                answer += 'R';
                nunberofRandL[0]++;
            }
            else {
                answer += 'L';
                nunberofRandL[1]++;
            }
        }
        return answer;
    }
}
