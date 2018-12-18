import sun.plugin2.jvm.RemoteJVMLauncher;

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

    private RemoteJVMLauncher.CallBack callBack;

    public RemoteJVMLauncher.CallBack getCallBack() {
        return callBack;
    }

    public void setCallBack(RemoteJVMLauncher.CallBack callBack) {
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
    // 初始化随机雷子
    private void makeRandomMines() {
        if (beanArr == null) {
            return;
        }
        int nowMines = 0;//临时变量，暂时存放已经放置的雷的个数
        while (nowMines < mMineCount) {
            int i = random.nextInt(beanArr.length);
            int j = random.nextInt(beanArr[0].length);
            MineBean mineBean = beanArr[i][j];
            if (!mineBean.isMineNow()) {//如果不是雷，则设置为雷，并且计数加1
                mineBean.setMineNow();
                nowMines++;
            }
        }
    }
}
