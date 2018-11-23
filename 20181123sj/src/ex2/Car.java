package ex2;


import javax.jws.Oneway;

/**
 * Created by Qwhying on 2018/11/23
 */
public class Car {

    private ComputeWeight weights[]=new ComputeWeight[3];
    public double totalweight(){
        double totalweight=0;
        for(ComputeWeight e:weights)
        {
            totalweight+=e.computeWeight();
        }
        return totalweight;
    }
    Car()
    {
        weights[0]=new Computer();
        weights[1]=new Television();
        weights[2]=new WashMachine();
    }

    public static void main(String[] args) {
        Car car=new Car();
        double tw=car.totalweight();
        System.out.println(tw);
    }
}
