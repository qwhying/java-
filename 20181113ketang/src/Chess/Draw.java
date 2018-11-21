package Chess; /**
 * Created by Qwhying on 2018/11/19
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Draw extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JScrollPane jsp = new JScrollPane();
    DrawPanel dp = new DrawPanel();
    JPanel op = new JPanel(); // option panel的意思，你不喜欢可以换咯
    JButton jb1 = new JButton("放大 x2");
    JButton jb2 = new JButton("缩小 x0.5");

    public Draw() {
        //setUndecorated(true); // 我喜欢没有边框的窗口
        setSize(600, 430);
        setLayout(null); // 我喜欢自定义布局
        setLocationRelativeTo(null);

        jsp.setBounds(10, 10, 400, 400);
        jsp.setViewportView(dp);
        getContentPane().add(jsp);

        op.setBounds(420, 10, 170, 400);
        op.add(jb1);
        op.add(jb2);
        getContentPane().add(op);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        setVisible(true);
    }

    class DrawPanel extends JPanel {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        int unit = 20;// 单位：像素

        @Override
        public void paintComponent(Graphics g) {
            setPreferredSize(new Dimension(20 * unit, 20 * unit));
            jsp.setViewportView(this);
            for (int i = 0; i < 19; i++) { // 绘制横向线条
                g.drawLine(10, i * unit + 10, 18 * unit + 10, i * unit + 10);
            }
            for (int i = 0; i < 19; i++) { // 绘制纵向线条
                g.drawLine(10 + i * unit, 10, i * unit + 10, 10 + 18 * unit);
            }
        }

        public void setUnit(int unit) { // setSize()和getSize()不能随便用……
            this.unit = unit;
        }

        public int getUnit() {
            return unit;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            dp.setUnit(dp.getUnit() * 2); // 这里你可以自行添加最大和最小值，也可以自己设置放大和缩小的倍数，我就写个样板
        } else if (e.getSource() == jb2) {
            dp.setUnit(dp.getUnit() / 2);
        }
        dp.repaint();
    }

    public static void main(String args[]) {
        new Draw();
    }
}