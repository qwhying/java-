package thinkingproblem;

/**
 * Created by Qwhying on 2018/10/13
 */
public class Toll
{
    private final int BigcarToll=10;//toll for big car
    private final int SmallcarToll=5;//toll for small car
    private int Bigcars;//the number of big cars
    private int Smallcars;//the number of small cars
    Toll()
    {
        this(0,0);
    }
    Toll(int b,int s)
    {
        Bigcars=b;
        Smallcars=s;
    }
    public void passAbigcar()
    {
        Bigcars++;
    }
    public void passAsmallcar()
    {
        Smallcars++;
    }
    public int totalsum() {
        return Bigcars * BigcarToll + Smallcars * SmallcarToll;
    }
    public int getBigcars()
    {
        return Bigcars;
    }
    public int getSmallcars()
    {
        return Smallcars;
    }
    public int getCars()
    {
        return Bigcars+Smallcars;
    }
}

