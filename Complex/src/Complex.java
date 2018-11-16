/**
 * Created by Qwhying on 2018/11/16
 */
public class Complex {
    private int RealPart;//实数部分
    private int ImaginPart;//虚数部分
    Complex()
    {
      this.ImaginPart=0;
      this.RealPart=0;
    }
    Complex(int r,int i)
    {
        this.RealPart=r;
        this.ImaginPart=i;
    }
    public Complex complexAdd(Complex a)
    {
        this.RealPart+=a.RealPart;
        this.ImaginPart+=a.ImaginPart;
        return this;
    }
    public String ToString()
    {
        String ans;
        if(this.ImaginPart<0)
        ans=""+this.RealPart+this.ImaginPart+'i';
        else if(this.ImaginPart==0)
        ans=""+this.RealPart;
        else
        ans=""+this.RealPart+'+'+this.ImaginPart+'i';
        return ans;
    }

}
