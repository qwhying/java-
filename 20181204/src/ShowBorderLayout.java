import javax.swing.*;
import java.awt.*;

/**
 * Created by Qwhying on 2018/12/11
 */
public class ShowBorderLayout extends JFrame {

    public ShowBorderLayout ()
    {
        //Set BorderLayout with horizontal gap 5 and vertical gap 10
        setLayout(new BorderLayout(5,10));
        //add buttons to the frame
        add(new JButton("East"),BorderLayout.EAST );
        add(new JButton("South"),BorderLayout.SOUTH );
        add(new JButton("West"),BorderLayout.WEST  );
        add(new JButton("North"),BorderLayout.NORTH );
        add(new JButton("Center"),BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ShowBorderLayout  frame=new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE );
        frame.setVisible(true);

    }
}
