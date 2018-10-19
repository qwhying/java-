package com.company;

/**
 * Created by Qwhying on 2018/10/19
 */
public class Person {
    private String name;
    private String address;
    public Person(String n,String a)
    {
        name=n;
        address=a;
    }
    public Person()
    {
        this("","");
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public String  getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
}
