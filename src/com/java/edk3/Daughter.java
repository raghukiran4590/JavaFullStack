package com.java.edk3;

public class Daughter extends Father {

    public Daughter() {
        System.out.println("In the daughter class");
    }

    public void getAge() {
        System.out.println("The age of the daughter is : "+this.age);
    }

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.getAge();
    }
}
