package com.workintech.model;

public class HRManager extends Employee {

    JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[3];
    MidDeveloper[] midDevelopers = new MidDeveloper[3];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[3];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        salary = 45000;
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(JuniorDeveloper yeniEleman){
        for(int i = 0; i < juniorDevelopers.length; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = yeniEleman;
                break;
            } else if(i == juniorDevelopers.length - 1) {
                for(JuniorDeveloper juniorDeveloper: juniorDevelopers){
                    System.out.println(juniorDeveloper.name);
                }
                System.out.println("Junior Developer dizisi tamamen dolu");
            }
        }
    }

    public void addEmployee(MidDeveloper yeniEleman){
        for(int i = 0; i < midDevelopers.length; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = yeniEleman;
                break;
            } else if(i == midDevelopers.length - 1) {
                System.out.println("Mid Developer dizisi tamamen dolu");
            }
        }
    }

    public void addEmployee(SeniorDeveloper yeniEleman){
        for(int i = 0; i < seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = yeniEleman;
                break;
            } else if(i == seniorDevelopers.length - 1) {
                System.out.println("Junior Developer dizisi tamamen dolu");
            }
        }
    }
}
