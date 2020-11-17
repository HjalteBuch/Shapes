package com.company;


public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, Point p1, Point p2, Point p3) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sideA = p1.distanceToPoint(p2);
        this.sideB = p2.distanceToPoint(p3);
        this.sideC = p1.distanceToPoint(p3);
    }

    @Override
    double calculateArea() {
        return (p1.getX()*(p2.getY() - p3.getY()) + p2.getX() * (p3.getY()-p1.getY()) + p3.getX() * (p1.getY()- p2.getY()))/2;
    }

    @Override
    Point calculateCenter() {
        int centerX = (p1.getX()+p2.getX()+p3.getX())/2;
        int centerY = (p1.getY()+p2.getY()+p3.getY())/2;
        return new Point(centerX, centerY);
    }

    @Override
    double calculateCircumference() {
        return sideA + sideB + sideC;
    }
}
