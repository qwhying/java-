package com.company;

/**
 * Created by Qwhying on 2018/10/19
 */
public class Employee extends Person implements Add
{
    private String ID;
    private double wage;
    private int seniority;
    public Employee(String n,String a,String Id,double Wage,int Seniority)
    {
        setName(n);
        setAddress(a);
        ID=Id;
        wage=Wage;
        seniority=Seniority;
    }
    public Employee()
    {
        this("","","",0,0);
    }
    public void addWage()
    {
        wage*=1.1;
    }
    public void print()
    {
        System.out.println("Employee name is"+getName());
        System.out.println("address is :"+getAddress());
        System.out.println("ID is ："+ID);
        System.out.println("wage is "+wage);
        System.out.println("Seniority is :"+seniority);
    }

}