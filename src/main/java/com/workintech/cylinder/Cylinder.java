package com.workintech.cylinder;

public class Cylinder extends Circle{
    private  double height;

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume()
    {
        return this.height * this.getArea();
    }


}
