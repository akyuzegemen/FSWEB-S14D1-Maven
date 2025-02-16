package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper (int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(double salary)
    {
        System.out.println("Senior Developer starts to working");
        this.setSalary(salary);
    }
}
