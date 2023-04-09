package com.java.edk5;

import java.util.ArrayList;
import java.util.List;

//Write a program to insert 1 to 10 numbers in ArrayList and display them
public class ArraylistExample {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        System.out.println("Insert 1 to 10 numbers in ArrayList and display them");

        for (int j = 0; j < 10; j++) {
            numList.add(j+1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numList.get(i));
        }
    }

}
