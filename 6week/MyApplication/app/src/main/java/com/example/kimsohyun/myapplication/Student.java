package com.example.kimsohyun.myapplication;

/**
 * Created by kimsohyun on 2017-03-18.
 */

public class Student {
    private String Name;
    private String Age;

    public Student(String name,String age) {
        this.Name = name;
        this.Age = age;
    }

    public String getStudentname() {

        return this.Name;
    }
    public String getStudentage() {

        return this.Age;
    }
}

