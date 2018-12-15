import javax.swing.*;
import java.awt.*;

/**
 * Created by Qwhying on 2018/12/11
 */
public class ShowGridLayout extends JFrame {
    public ShowGridLayout()
    {//set gridlayout(),3 rows,2 columns,add gaps 5 between
        //components horizontally and vertically
        setLayout(new GridLayout(2,2));

        //ADD labels and text fields to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    /** Main method*/
    public static void main(String[] args) {
        ShowGridLayout frame=new ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(200,125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
