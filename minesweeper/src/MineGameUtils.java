import sun.plugin2.jvm.RemoteJVMLauncher;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Qwhying on 2018/12/16
 */
public class MineGameUtils {
    private int mMineCount;// 雷子个数
    public int mRowNums;// 格子行数
    public int mColumnNums;// 格子列数

    private MineBean[][] beanArr;// 雷状态对应的数组

    private int unOpenMines;// 剩余未开启格子数量
    private int flagMines;// 标记为雷子的个数

    private long gameStartTime;// 游戏开始时间
    private boolean isGameOver = false;// 游戏是否结束

    private Random random = new Random();

    private CallBack callBack;

    public CallBack getCallBack() {
        return callBack;
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }
    /**
     * 构造函数
     *
     * @param mineCount
     *            总共雷子个数
     * @param rowNums
     *            格子行数
     * @param columnNums
     *            格子烈数
     * @param callBack
     *            回调
     */
    public MineGameUtils(int mineCount, int rowNums, int columnNums, RemoteJVMLauncher.CallBack callBack) {//构造函数
        if (mineCount <= 1 || rowNums <= 1 || columnNums <= 1) {
            return;
        }
        this.mMineCount = mineCount;
        this.mRowNums = rowNums;
        this.mColumnNums = columnNums;
        this.callBack = callBack;

        // 初始化
        reset();
    }
    public void reset() {//重置（主要是存放雷的数组）
        resetOrCreateGrids(mRowNums, mColumnNums);
        makeRandomMines();
        initGridAroundStatus();
        unOpenMines = beanArr.length * beanArr[0].length;
        flagMines = 0;
        gameStartTime = 0;
        isGameOver = false;
        if (this.callBack != null) {
            this.callBack.onInit();
        }
    }
    // 初始化所有格子
    private void resetOrCreateGrids(int rowNums, int columnNums) {
        if (beanArr == null) {
            beanArr = new MineBean[rowNums][columnNums];
        }
        for (int i = 0; i < beanArr.length; i++) {
            for (int j = 0; j < beanArr[i].length; j++) {
                if (beanArr[i][j] == null) {
                    beanArr[i][j] = new MineBean();
                }
                beanArr[i][j].reset();//设置格子为初始状态
            }
        }
    }
    // 随机初始化雷
    private void makeRandomMines() {
        if (beanArr == null) {
            return;
        }
        int nowMines = 0;//临时变量，暂时存放已经放置的雷的个数
        while (nowMines < mMineCount) {
            int i = random.nextInt(beanArr.length);//行数随机
            int j = random.nextInt(beanArr[0].length);//列数随机
            MineBean mineBean = beanArr[i][j];
            if (!mineBean.isMineNow()) {//如果不是雷，则设置为雷，并且计数加1
                mineBean.setMineNow();
                nowMines++;
            }
        }
    }
    // 计算格子周围雷子状态
    private void initGridAroundStatus() {
        if (beanArr == null) {
            return;
        }
        for (int i = 0; i < beanArr.length; i++) {
            for (int j = 0; j < beanArr[i].length; j++) {
                MineBean mineBean = beanArr[i][j];
                if (mineBean.isMineNow()) {
                    // 当前格子是雷
                    continue;
                }
                // 取当前格子周围有效的格子集合
                ArrayList<Point> list = getAroundGrids(i, j);//获取当前格周围的6个格子
                int mineCount = 0;
                Point tempPoint = null;
                MineBean tempBean = null;
                // 统计这些点是否是雷
                for (int k = 0; k < list.size(); k++) {
                    tempPoint = list.get(k);
                    if (tempPoint == null) {
                        continue;
                    }
                    tempBean = getMineBean(tempPoint.x, tempPoint.y);
                    if (tempBean == null) {
                        continue;
                    }
                    if (tempBean.isMineNow()) {
                        mineCount++;
                    }
                }
                mineBean.setMineCount(mineCount);
            }
        }
    }
    private ArrayList<Point> getAroundGrids(int i, int j) {
        if (beanArr == null) {
            return null;
        }
        // 取当前格子周围的8个点
        Point point1 = new Point((i - 1), (j - 1));
        Point point2 = new Point((i - 1), (j));
        Point point3 = new Point((i - 1), (j + 1));
        Point point4 = new Point((i), (j - 1));
        Point point5 = new Point((i), (j + 1));
        Point point6 = new Point((i + 1), (j - 1));
        Point point7 = new Point((i + 1), (j));
        Point point8 = new Point((i + 1), (j + 1));
        ArrayList<Point> aroundList = new ArrayList<>();
        aroundList.add(point1);
        aroundList.add(point2);
        aroundList.add(point3);
        aroundList.add(point4);
        aroundList.add(point5);
        aroundList.add(point6);
        aroundList.add(point7);
        aroundList.add(point8);
        for (int k = 0; k < aroundList.size(); k++) {
            Point pointTemp = aroundList.get(k);
            if (pointTemp.x < 0 || pointTemp.x >= beanArr.length || pointTemp.y < 0
                    || pointTemp.y >= beanArr[0].length) {
                // 越界
                aroundList.remove(k);
                k--;
            }
        }
        return aroundList;
    }
    public MineBean getMineBean(int i, int j) {//获取指定坐标下格子的信息
        if (beanArr == null) {
            return null;
        }
        try {
            return beanArr[i][j];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void leftClick(int i, int j) {//左键点击
        if (beanArr == null || this.callBack == null || this.isGameOver) {
            return;
        }
        MineBean mineBean = getMineBean(i, j);
        if (mineBean == null) {
            return;
        }
        if (mineBean.getisClicked()) {
            return;
        }
        mineBean.setClicked(true);
        if (unOpenMines < 0) {//未开启的格子数量
            unOpenMines = 0;
        }
        unOpenMines--;
        if (mineBean.isMineNow()) {
            isGameOver = true;
            gameOver(i, j);
            return;
        }
        if (gameStartTime <= 0) {
            gameStartTime = System.currentTimeMillis();
        }
        if (this.callBack != null) {
            this.callBack.onLeftClick(mineBean, i, j);
        }
        checkWin();//检查是否胜利
        if (mineBean.getMineCount() == MineType.MINE_STATUS_OPEN_0) {
            // 递归摊开一片
            recursionAround(i, j);
        }
    }
    private void recursionAround(int i, int j) {//递归摊开所有不是雷的一片区域
        ArrayList<Point> list = getAroundGrids(i, j);
        for (int k = 0; k < list.size(); k++) {
            Point tempPoint = list.get(k);
            if (tempPoint == null) {
                continue;
            }
            MineBean mineBean = getMineBean(tempPoint.x, tempPoint.y);
            if (mineBean == null) {
                continue;
            }
            if (mineBean.isMineNow()) {//如果是雷，则跳过，不做操作
                continue;
            }
            if (mineBean.getisClicked()) {//如果是已经被点开了，也跳过，不进行操作
                continue;
            }
            leftClick(tempPoint.x, tempPoint.y);//递归操作，点开满足条件的点，应该是深度优先遍历
        }
    }
    public void rightClick(int i, int j) {//右键点击
        if (beanArr == null || this.callBack == null || this.isGameOver) {
            return;
        }
        MineBean mineBean = getMineBean(i, j);
        if (mineBean == null) {
            return;
        }
        if (mineBean.getisClicked()) {
            return;
        }
        if (gameStartTime <= 0) {
            gameStartTime = System.currentTimeMillis();
        }
        if (flagMines < 0) {
            flagMines = 0;
        }
        if (mineBean.getImageStatus() == MineType.MINE_STATUS_BLANK) {//如果当前格子状态是初始默认状态，则则插旗，旗子数加1
            mineBean.setImageStatus(MineType.MINE_STATUS_FLAG);
            flagMines++;
        } else if (mineBean.getImageStatus() == MineType.MINE_STATUS_FLAG) {//如果当前格子状态是旗子，则改为问号，旗子数减1
            mineBean.setImageStatus(MineType.MINE_STATUS_UNKNOW);
            flagMines--;
        } else if (mineBean.getImageStatus() == MineType.MINE_STATUS_UNKNOW) {//如果当前格子状态为问号，则改为初始默认空白图标
            mineBean.setImageStatus(MineType.MINE_STATUS_BLANK);
        }
        if (this.callBack != null) {
            this.callBack.onRightClick(mineBean, i, j);
        }
        checkWin();
    }
    private void checkWin() {
        if (flagMines != unOpenMines) {
            return;
        }
        isGameOver = true;
        if (this.callBack != null) {
            this.callBack.onWin(System.currentTimeMillis() - gameStartTime);
        }
    }
    public interface CallBack {
        void onInit();

        void onWin(long time);// 胜利

        void onGameOver();// 失败

        void onLeftClick(MineBean mineBean, int i, int j);

        void onRightClick(MineBean mineBean, int i, int j);
    }
}
