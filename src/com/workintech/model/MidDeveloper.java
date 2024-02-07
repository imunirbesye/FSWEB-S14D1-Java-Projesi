package com.workintech.model;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        salary = 40000;
        System.out.println("Mid Developer starts to working");
    }

}
