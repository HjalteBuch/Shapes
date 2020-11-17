package com.company;

abstract public class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    double calculateArea() {
        return 0;
    }

    Point calculateCenter(){
        return null;
    }

    double calculateCircumference(){
        return 0;
    }

    @Override
    public String toString() {
        return name + " has area: " + calculateArea() + ", center: " + calculateCenter() + ", circumference: " + calculateCircumference();
    }
}
