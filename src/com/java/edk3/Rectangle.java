package com.java.edk3;

public class Rectangle extends Shape{

    int size = 20;
    int radius = 10;

    @Override
    public void display() {
        System.out.println("This is Rectangle shape");
    }

    public int getSize() {
        System.out.println("Size of the shape is : ");
        return size;
    }

    public int getRadius() {
        System.out.println("Radius of the shape is : ");
        return radius;
    }
}
