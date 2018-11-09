/**
 * Created by Qwhying on 2018/11/9
 */
import java.io.IOException;
import java.util.*;
public class statistics
{
    public static void main(String[] args) {
        java.io.File file=new java.io.File("src/input.txt");
        if(file.exists())
        {
            System.out.println("File already exists");

        }
        java.io.File file1=new java.io.File("src/result.txt");
        if(file1.exists())
        {
            System.out.println("File already exists");

        }
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(file1.getParent());
        try(
           java.io.PrintWriter output=new java.io.PrintWriter(file1);
           Scanner input=new Scanner(file);
           ) {
            int CapitalLetters = 0;
            int Lowercases = 0;
            ArrayList<String> text = new ArrayList<String>();
            while (input.hasNext()) {
                String temp = input.nextLine();
                //StringBuilder t=new StringBuilder();
                //t.append(temp);
                for (int i = 0; i < temp.length(); i++) {
                    if (Character.isUpperCase((temp.charAt(i)))) {
                        CapitalLetters++;

                    } else if (Character.isLowerCase(temp.charAt(i))) {
                        Lowercases++;
                    }

                }
                temp = temp.toUpperCase();
                text.add(temp);
                output.println(temp);
            }
            System.out.println("number of Uppercases: "+CapitalLetters);
            System.out.println("number of Lowercases: "+Lowercases);
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex.getMessage(),ex);
        }
    }
}
