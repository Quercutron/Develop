package com.itheima.a01oopextensDome;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work(){
        System.out.println("学生是"+getName()+","+getAge());
    }
}
