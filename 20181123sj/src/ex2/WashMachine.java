package ex2;

/**
 * Created by Qwhying on 2018/11/23
 */
public class WashMachine implements ComputeWeight {
    private double weight;
    public double computeWeight()
    {
        return weight;
    }
    WashMachine()
    {
        weight=300;
    }
}
