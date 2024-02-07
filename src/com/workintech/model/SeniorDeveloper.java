package com.workintech.model;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        salary = 55000;
        System.out.println("Senior Developer starts to working");
    }
}
