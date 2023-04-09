package com.java.edk5;

public class Student {
    String stuName;
    String stuCourse;
    int stuMarks;

    public Student(String stuName, String stuCourse, int stuMarks) {
        this.stuName = stuName;
        this.stuCourse = stuCourse;
        this.stuMarks = stuMarks;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }

    public int getStuMarks() {
        return stuMarks;
    }

    public void setStuMarks(int stuMarks) {
        this.stuMarks = stuMarks;
    }
}
