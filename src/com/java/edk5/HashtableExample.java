package com.java.edk5;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

        public static void main(String[] args)
        {
            int highestMarks=0;
            String highMarksStudent = "";
            String highMarksCourse = "";

            // Create an instance of Hashtable
            Hashtable<Integer, Student> ht = new Hashtable<>();
            ht.put(1, new Student("Raghu", "SpringBoot", 50));
            ht.put(2, new Student("Nitin", "NodeJS", 96));
            ht.put(3, new Student("Sandy", "VueJS", 55));
            ht.put(4, new Student("Hari", "AngularJS", 34));
            ht.put(5, new Student("Rakesh", "ReactJS", 82));

            System.out.println("Size of the HashMap is : "+ht.size());
            for (Map.Entry<Integer, Student> h : ht.entrySet()) {
                System.out.println(" stuName: " + h.getValue().getStuName()
                        + " stuCourse: " + h.getValue().getStuCourse()
                        + " stuMarks: " + h.getValue().getStuMarks());
                if(highestMarks < h.getValue().getStuMarks()){
                    highestMarks = h.getValue().getStuMarks();
                    highMarksStudent = h.getValue().getStuName();
                    highMarksCourse = h.getValue().getStuCourse();
                }
            }
            System.out.println(highMarksStudent+" has achieved the highest marks of "+highestMarks
            +" in the course "+highMarksCourse);
        }
}
