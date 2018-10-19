package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager m1=new Manager("a","b","1",10000);
        Employee e1=new Employee("c","d","12",5000,5);
        m1.print();
        e1.print();
        m1.addWage();
        e1.addWage();
        m1.print();
        e1.print();
    }
}
