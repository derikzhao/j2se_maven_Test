package com.javatest;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Student {
    String Name;
    int No;

    public Student() {
        System.out.println("我是学生");
    }

    public Student(String Name) {
        this.Name = Name;
    }

    public void ShowName() {
        System.out.println(Name);
    }
}
