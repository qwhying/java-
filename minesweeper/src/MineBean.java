/**
 * Created by Qwhying on 2018/12/15
 */
public class MineBean {
    public static int MINE_VALUE = 9;// 是雷的格子值

    private boolean isClicked = false;// 是否左键点开了格子
    private int mineCount = 0;// 周围雷的个数标记值(如果是9，则为雷)
    private int imageStatus = MineType.MINE_STATUS_BLANK;// 未点开图片状态
    public MineBean() {
    }
    public MineBean(boolean isClicked, int mineCount, int imageStatus) {
        super();
        this.isClicked = isClicked;
        this.mineCount = mineCount;
        this.imageStatus = imageStatus;
    }
    public boolean getisClicked() {
        return isClicked;
    }

    public void setClicked(boolean isClicked) {
        this.isClicked = isClicked;
    }

    public int getMineCount() {
        return mineCount;
    }

    public void setMineCount(int mineCount) {
        this.mineCount = mineCount;
    }

    public int getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(int imageStatus) {
        this.imageStatus = imageStatus;
    }

    // 判断当前位置是否是雷
    public boolean isMineNow() {
        return mineCount == MINE_VALUE;
    }

    public void setMineNow() {
        mineCount = MINE_VALUE;
    }
    public void reset() {
        isClicked = false;// 是否左键点开了格子
        mineCount = 0;// 周围雷的个数标记值(如果是9，则为雷)
        imageStatus = MineType.MINE_STATUS_BLANK;// 图片状态
    }
}
