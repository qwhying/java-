package ex2;

/**
 * Created by Qwhying on 2018/11/23
 */
public class Computer implements ComputeWeight {
    private double  weight=0;
    public double computeWeight()
    {
        return weight;

    }
    Computer()
    {
        weight=10;
    }
}
