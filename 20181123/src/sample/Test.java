package sample;

/**
 * Created by Qwhying on 2018/11/25
 */
import javax.swing.*;
import java.awt.Graphics;

public class Test extends JFrame{
    public Test(){
        add(new NewPanel());
    }
    public static void main(String[] args){
        Test frame = new Test();
        frame.setTitle("围棋");
        frame.setSize(460, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class NewPanel extends JPanel{
        final int rPoint = 3;
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            for(int i=20;i<=400;i+=20){
                g.drawLine(i, 20, i, 400);
                g.drawLine(20, i, 400, i);
            }
            for(int i=80-rPoint;i<=320;i+=120)
                for(int j=80-rPoint;j<=320;j+=120)
                    g.fillArc(i, j, 2*rPoint, 2*rPoint, 0, 360);

        }
    }
}
