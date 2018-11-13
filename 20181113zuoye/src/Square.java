/**
 * Created by Qwhying on 2018/11/13
 */
public class Square  extends GeometricObject implements Colorable{
    private double side_;
    Square(){
        side_=0;
    }
    Square(double side){
        this.side_=side;
    }
    public double getSide(){
        return side_;
    }
    public void setSide(double side){
        this.side_=side;
    }
    public void howToColor(){
        if(side_==0){
            System.out.println("不是正方形");
        }
        else{
            System.out.println("Color all four sides");
            System.out.println("四边形边长为"+side_);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Square s=new Square();
        s.howToColor();
        Square s2=new Square(5.0);
        s2.howToColor();

    }

}
