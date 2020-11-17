package com.company;

public class Circle extends Shape{
    private Point center;
    private int radius;
    private double pi = 3.14;

    public Circle(String name, Point center, int radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return pi * (radius*radius);
    }

    @Override
    Point calculateCenter() {
        return center;
    }

    @Override
    double calculateCircumference() {
        return radius*2 * pi;
    }
}
