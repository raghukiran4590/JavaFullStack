package com.java.edk3;

public class Square extends Shape {

    int size = 10;
    int radius = 5;

    @Override
    public void display() {
        System.out.println("This is Square shape");
    }

    public int getSize() {
        //System.out.println("Size of the shape is : ");
        return size;
    }

    public int getRadius() {
        //System.out.println("Radius of the shape is : ");
        return radius;
    }

}
