package shangji20181012;

public class Rectangle {
    double width,length;       
    public void setWidth(double w) {
       if(w > 0)
         this.width=w;
    }
    public double getWidth(){
       return width;
    }
    public void setLength (double h) {
       if(length > 0)
         this.length =h;
    }
    public double getLength () {
       return length;
    }
}
