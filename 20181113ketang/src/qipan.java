/**
 * Created by Qwhying on 2018/11/13
 */
import javax.swing.*;
import java.awt.Graphics;
public class qipan extends JFrame {
    public qipan() {
        add(new NewPanel());
    }


    public static void main(String[] args) {
        qipan frame=new qipan();
        frame.setTitle("棋盘");
        frame.setSize(200,200);
        frame.set

    }
}
class NewPanel extends  JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0,0,50,50);
        g.drawString("Banner",0,40);
    }
}
