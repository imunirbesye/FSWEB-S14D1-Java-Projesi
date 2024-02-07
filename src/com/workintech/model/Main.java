package com.workintech.model;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


        System.out.println("----------------------------");


        HRManager hr = new HRManager(1, "Ali", 50000);
        JuniorDeveloper munir = new JuniorDeveloper(1, "Münir", 30000);
        JuniorDeveloper arda = new JuniorDeveloper(2, "Arda", 30000);
        JuniorDeveloper ali = new JuniorDeveloper(3, "Ali", 30000);

        hr.work();
        hr.addEmployee(munir);
        hr.addEmployee(arda);
        hr.addEmployee(ali);
        hr.addEmployee(munir);
    }
}