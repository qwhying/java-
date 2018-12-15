import javax.swing.*;
import java.awt.*;

/**
 * Created by Qwhying on 2018/12/15
 */
public class TestImageIcon extends JFrame{
    private ImageIcon cimuIcon=new ImageIcon("D:\\gay\\图片\\cimu.jpg");
    private ImageIcon dajiuIcon=new ImageIcon("D:\\gay\\图片\\dajiu.jpg");
    public TestImageIcon(){
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(cimuIcon));
        add(new JButton(dajiuIcon));
    }

    public static void main(String[] args) {
        TestImageIcon frame=new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
