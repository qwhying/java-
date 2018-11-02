/**
 * Created by Qwhying on 2018/11/2
 */
import java.io.FileReader;
import java.io.IOException;
public class ex3 {
    /** Defines the entry point of the program. */
    public static void main(String[] args) {
        System.out.println("Please enter the file path:");
        try {
            String fileName = "";
            while(true) {
                int readByte = System.in.read();//1.读入输入的单个字符的ascii码
                if(readByte == -1 || readByte == '\r')//2.如果输入的字符结束或者等于换行符则输入结束
                    break;
                fileName += (char) readByte;//3.将输入的字符加到文件名的后面
            }
            // Reads the file and prints it to the System.out stream.
            char[] buffer = new char[20];//4.创建一个数组,当作缓冲器
            FileReader reader = new FileReader(fileName);//5.创建一个文件读取类
            while(true) {
                int length = reader.read(buffer);//6.将文件中的内容读取到缓冲器中，用length存储读取到的字符个数
                if(length < 0) // Reads a long as there is more data.
                    break;
                String text = new String(buffer, 0, length);//7.将缓冲器中的字符转化为String类型并打印出来
                System.out.print(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}