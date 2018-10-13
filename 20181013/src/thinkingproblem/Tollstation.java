package thinkingproblem;

/**
 * Created by Qwhying on 2018/10/13
 */
public class Tollstation {
    public static void main(String[] args)
    {
        Toll t=new Toll();
        t.passAbigcar();
        t.passAsmallcar();
        t.passAbigcar();
        t.passAsmallcar();
        t.passAbigcar();
        System.out.println("There has been passed "+t.getBigcars()+" big cars.");
        System.out.println("There has been passed "+t.getSmallcars()+" small cars.");
        System.out.println("There has been passed "+t.getCars()+"cars.");
        System.out.println("The total income is "+t.totalsum()+".");

    }
}
