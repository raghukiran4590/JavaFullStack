package com.java.edk3;

public abstract class Shape {

    String color;

    public abstract void display();

    public void setColor(){
        System.out.println("Set the required color for the shape");
    }

}
