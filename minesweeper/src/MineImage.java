import javax.swing.*;
import java.awt.*;

/**
 * Created by Qwhying on 2018/12/15
 */
public class MineImage extends JFrame {
    public static ImageIcon getImageIcon(int width, int height, int mineStatus)//设置按钮图标的函数，返回一个对应图片的图像图标
    {
        String imagePath = null;
        if (mineStatus == MineType.MINE_STATUS_OPEN_0) {
            imagePath = "images/m0.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_1) {
            imagePath = "images/m1.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_2) {
            imagePath = "images/m2.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_3) {
            imagePath = "images/m3.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_4) {
            imagePath = "images/m4.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_5) {
            imagePath = "images/m5.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_6) {
            imagePath = "images/m6.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_7) {
            imagePath = "images/m7.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_8) {
            imagePath = "images/m8.png";
        } else if (mineStatus == MineType.MINE_STATUS_OPEN_9) {
            imagePath = "images/m9.png";
        } else if (mineStatus == MineType.MINE_STATUS_BLANK) {
            imagePath = "images/blank.png";
        } else if (mineStatus == MineType.MINE_STATUS_FLAG) {
            imagePath = "images/flag.png";
        } else if (mineStatus == MineType.MINE_STATUS_UNKNOW) {
            imagePath = "images/unknow.png";
        } else if (mineStatus == MineType.MINE_STATUS_MINE_CLICK) {//点击到了雷上
            imagePath = "images/mine_click.png";
        } else if (mineStatus == MineType.MINE_STATUS_DEAD) {
            imagePath = "images/facedead.png";
        } else if (mineStatus == MineType.MINE_STATUS_MILE) {
            imagePath = "images/facesmile.png";
        } else if (mineStatus == MineType.MINE_STATUS_WAIT) {
            imagePath = "images/facewait.png";
        } else if (mineStatus == MineType.MINE_STATUS_WIN) {
            imagePath = "images/facewin.png";
        } else if (mineStatus == MineType.MINE_STATUS_LOGO) {
            imagePath = "images/logo.png";
        }

        if (imagePath == null || "".equals(imagePath)) {//如果当前图片路径为空
            return null;
        }
        ImageIcon icon = new ImageIcon(imagePath);
        // 图像缩放为适合Frame大小
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_FAST);
        if (img == null) {
            return null;
        }
        return new ImageIcon(img);
    }
}
