package shangji20181012;

public class CUBOID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Rectangle rect;
	private double height;
	CUBOID(){
		height=0;
	}
	CUBOID(double h,double w,double l){
		height=h;
		rect.setWidth(w);
		rect.setLength(l);
	}
	public double getVolume() {
		return height*rect.getWidth()*rect.getLength();
	}
	public double getBottomWidth() {
		return rect.getWidth();
	}
	public void setBottomWidth(double w)
	{
		rect.setWidth(w);
	}
	public double getBottomLength()
	{
		return rect.getLength();
	}
	public void setBottomLength(double h)
	{
		rect.setLength(h);
	}

}

