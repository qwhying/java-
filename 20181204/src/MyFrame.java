import javax.swing.*;

/**
 * Created by Qwhying on 2018/12/7
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MyFrame:");//Create a frame
        frame.setSize(400,300);
        //frame.setLocation(200, 800);
        frame.setLocationRelativeTo(null);//Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
