package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length)
    {
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0? 0: width;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        this.length = length < 0? 0: length;
    }

    public double getArea()
    {
        return this.width * this.length;
    }
}
