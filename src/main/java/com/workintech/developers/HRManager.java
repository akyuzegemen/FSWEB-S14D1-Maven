package com.workintech.developers;

public class HRManager extends Employee {
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }
    static private JuniorDeveloper [] juniorDevelopers;
    static private SeniorDeveloper [] seniorDevelopers;
    static private MidDeveloper [] midDevelopers;


    @Override
    public void work(double salary)
    {
        System.out.println("HR Manager starts to working");
        this.setSalary(salary);
    }

//    static void addEmployee (JuniorDeveloper emp)
//    {
//        this.juniorDevelopers[] = juniorDevelopers;
//    }
}
