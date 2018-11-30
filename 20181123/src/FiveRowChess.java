/**
 * Created by Qwhying on 2018/11/26
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.glass.events.MouseEvent;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

public class FiveRowChess extends JFrame {
    public FiveRowChess() {
        JPanel j=new NewPanel();
        j.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                System.out.println("x:"+(int)(e.getX()/50+1)+" y:"+(int)(e.getY()/50+1));// TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        add(j);
    }

    public static void main(String[] args) {
        FiveRowChess frame=new FiveRowChess();
        frame.setTitle("FiveRowChess");
        frame.setSize(700,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    class NewPanel extends JPanel {
        private int x;
        private int y;
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for(int i=0;i<14;i++) {
                g.drawLine(0, i*getHeight()/14, getWidth(), i*getHeight()/14);
                g.drawLine(i*getWidth()/14, 0,i*getWidth()/14, getHeight());
            }
            g.fillOval(140, 140, 10, 10);
            g.fillOval(getWidth()-150, 140, 10, 10);
            g.fillOval(140, getHeight()-150, 10, 10);
            g.fillOval(getWidth()-150, getHeight()-150, 10, 10);
            g.fillOval(7*50-10, 7*50-25, 10, 10);
        }
    }

}
