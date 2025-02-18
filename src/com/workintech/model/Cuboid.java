package com.workintech.model;

public class Cuboid extends Rectangle {

    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return width * length * height;
    }
}
