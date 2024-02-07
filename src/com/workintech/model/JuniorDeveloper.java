package com.workintech.model;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        salary = 30000;
        System.out.println("Junior Developer starts to working");
    }
}
