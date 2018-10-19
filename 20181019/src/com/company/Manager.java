package com.company;

/**
 * Created by Qwhying on 2018/10/19
 */
public class Manager extends Person implements Add{
    private String level;
    private double wage;
    public Manager(String n,String a,String Level,double Wage)
    {
        //setName(n);
        //setAddress(a);
        super(n,a);
        level=Level;
        wage=Wage;
    }
    public Manager()
    {
        this("","","",0);

    }
    public void addWage()
    {
        wage*=1.2;
    }
    public void print()
    {
        System.out.println("Employee name is"+getName());
        System.out.println("address is :"+getAddress());
        System.out.println("Level is ："+level);
        System.out.println("wage is "+wage);
    }
}
