package com.java.edk3;

public class ShapeApp {

    public static void main(String[] args) {
        Shape s = new Square();
        s.display();

        Shape r = new Rectangle();
        r.display();

        Shape c = new Rectangle();
        c.setColor();

    }
}
