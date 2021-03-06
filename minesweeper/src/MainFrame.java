import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Qwhying on 2018/12/16
 */
public class MainFrame extends JFrame  {
    public final int mMineCount = 60;// 雷个数
    public final int mRowNums = 20;// 格子行数
    public final int mColumnNums = 25;// 格子列数

    public final int mGridSideLength = 29;// 格子的边长

    private JButton[][] buttonArr;//每个按钮是一个格子
    private JButton resetBtn;//重新开始键

    private boolean isClickComplete = true;

    private int mWidth;
    private int mHeight;

    private MineGameUtils gameUtils;

    private static String GAME_TITLE = "扫雷游戏";

    // 入口
    public static void main(String[] args) {

        new MainFrame();
    }

    public MainFrame() {
        // 初始化UI对应的背景数组状态
        gameUtils = new MineGameUtils(mMineCount, mRowNums, mColumnNums, callback);

        mWidth = mColumnNums * mGridSideLength;
        mHeight = mRowNums * mGridSideLength;

        this.setResizable(false);
        this.setTitle(GAME_TITLE);
        this.setIconImage(SizeTools.getLogo());
        Dimension dimension = SizeTools.getScreenSize();
        // 设置窗口左上角位置
        this.setLocation((dimension.width - mWidth) >> 1,
                ((dimension.height - mHeight) >> 1) - SizeTools.getInsetsSize(this));
        // 设置窗口宽高
        this.setSize(mWidth, mHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(topLayout(), BorderLayout.NORTH);
        this.add(centerLayout(), BorderLayout.CENTER);
        // 显示窗口
        this.setVisible(true);
    }



    public JPanel topLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        resetBtn = new JButton();
        resetBtn.setBorderPainted(false); // 消除边框
        resetBtn.setContentAreaFilled(false); // 消除内容域，即中间的那一块
        setButtonImage(resetBtn, MineType.MINE_STATUS_MILE);
        resetBtn.addMouseListener(new MyMouseListener() {
            @Override
            public void mousePressed(MouseEvent paramMouseEvent) {
                setButtonImage(resetBtn, MineType.MINE_STATUS_WAIT);
            }

            @Override
            public void mouseReleased(MouseEvent paramMouseEvent) {
                setButtonImage(resetBtn, MineType.MINE_STATUS_MILE);
            }

            @Override
            public void mouseClicked(MouseEvent paramMouseEvent) {
                // 重新开始
                if (gameUtils == null) {
                    return;
                }
                gameUtils.reset();
            }
        });
        panel.add(resetBtn);
        return panel;
    }
    public JPanel centerLayout() {
        JPanel panel = new JPanel();
       // GridLayout gridLayout = new GridLayout(mRowNums, mColumnNums);
        panel.setLayout(new GridLayout(mRowNums,mColumnNums));
        if (buttonArr == null) {
            return panel;
        }
        for (int i = 0; i < mRowNums; i++) {
            for (int j = 0; j < mColumnNums; j++) {
                panel.add(buttonArr[i][j]);
                final int ii = i;
                final int jj = j;
                buttonArr[i][j].addMouseListener(new MyMouseListener() {
                    @Override
                    public void mouseLeftClicked(MouseEvent paramMouseEvent) {
                        leftClick(ii, jj);
                    }

                    @Override
                    public void mouseRightClicked(MouseEvent paramMouseEvent) {
                        rightClick(ii, jj);
                    }
                });
            }
        }
        return panel;
    }
    private void initButtons() {
        isClickComplete = true;
        if (buttonArr == null) {
            buttonArr = new JButton[mRowNums][mColumnNums];
        }
        for (int i = 0; i < mRowNums; i++) {
            for (int j = 0; j < mColumnNums; j++) {
                if (buttonArr[i][j] == null) {
                    buttonArr[i][j] = new JButton();
                }
                setButtonImage(buttonArr[i][j], MineType.MINE_STATUS_BLANK);
            }
        }
    }
    public void leftClick(int i, int j) {//鼠标左键点击
        if (gameUtils == null) {
            return;
        }
        // 防止重复点击
        if (!isClickComplete) {
            return;
        }
        isClickComplete = false;
        gameUtils.leftClick(i, j);
        isClickComplete = true;
    }
    public void rightClick(int i, int j) {//鼠标右键
        if (gameUtils == null) {
            return;
        }
        gameUtils.rightClick(i, j);
    }
    public void setButtonImage(JButton button, int flag) {//设置按钮的图片样式
        if (button == null) {
            return;
        }
        ImageIcon icon = MineImage.getImageIcon(mGridSideLength, mGridSideLength, flag);
        button.setIcon(icon);
    }
    private MineGameUtils.CallBack callback = new MineGameUtils.CallBack() {

        @Override
        public void onWin(long time) {
            if (resetBtn != null) {
                setButtonImage(resetBtn, MineType.MINE_STATUS_WIN);
            }
            JOptionPane.showMessageDialog(MainFrame.this, "胜利! 用时: " + time / 1000 + " 秒");
        }

        @Override
        public void onInit() {
            initButtons();
        }

        @Override
        public void onGameOver() {
            if (resetBtn != null) {
                setButtonImage(resetBtn, MineType.MINE_STATUS_DEAD);
            }
            JOptionPane.showMessageDialog(MainFrame.this, "好像是输了?!");
        }

        @Override
        public void onLeftClick(MineBean mineBean, int i, int j) {
            if (buttonArr == null || mineBean == null) {
                return;
            }
            setButtonImage(buttonArr[i][j], mineBean.getMineCount());
        }

        @Override
        public void onRightClick(MineBean mineBean, int i, int j) {
            if (buttonArr == null || mineBean == null) {
                return;
            }
            setButtonImage(buttonArr[i][j], mineBean.getImageStatus());
        }
    };

}
