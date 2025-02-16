package com.workintech.developers;

import java.sql.SQLOutput;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(double salary) {
        System.out.println("Mid Developer starts to working");
        this.setSalary(salary);
    }


}
