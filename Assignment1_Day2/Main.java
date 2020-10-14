package com.myjava;

public class Main {

    public static void main(String[] args)
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.name="Yasmeen";
        e1.age=20;
        e1.city="Hyderabad";
        e2.name="Sufiya";
        e2.age=17;
        e2.city="Kadapa";
        e1.display();
        e2.display();
    }
}
