package com.workintech.cylinder;

public class Circle {
    private double radius;


    public Circle(double radius)
    {
        this.setRadius(radius);
    }


    public void setRadius(double radius)
    {
        if(radius < 0)
        {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius()
    {
        return  this.radius;
    }

    public double getArea()
    {
        return this.radius * this.radius * Math.PI;
    }


}
