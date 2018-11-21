package Chess; /**
 * Created by Qwhying on 2018/11/19
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
public class DrawChessBoard extends JPanel{
    public Image boardImg;
    final private int ROWS = 19;
    public DrawChessBoard() {
        boardImg = Toolkit.getDefaultToolkit().getImage("src/Chess/abc.jpg");
        if(boardImg == null)
            System.err.println("png do not exist");
    }
    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        int imgWidth = boardImg.getWidth(this);
        int imgHeight = boardImg.getHeight(this);
        int FWidth = getWidth();
        int FHeight= getHeight();

        int x=(FWidth-imgWidth)/2;
        int y=(FHeight-imgHeight)/2;
        g.drawImage(boardImg, x, y, null);

        int margin = x;
        int span_x=imgWidth/ROWS;
        int span_y=imgHeight/ROWS;
        //画横线
        for(int i=0;i<ROWS;i++)
        {
            g.drawLine(x, y+i*span_y, FWidth-x,y+i*span_y);
        }
        //画竖线
        for(int i=0;i<ROWS;i++)
        {
            g.drawLine(x+i*span_x, y, x+i*span_x,FHeight-y);
        }

    }
}
