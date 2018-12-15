import javax.swing.*;

/**
 * Created by Qwhying on 2018/12/7
 */
public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MyFrameWithComponents");
        JButton jbtOK=new JButton("OK");
        frame.add(jbtOK);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
