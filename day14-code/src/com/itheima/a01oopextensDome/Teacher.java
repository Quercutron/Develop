package com.itheima.a01oopextensDome;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void work(){
        System.out.println("老师是"+getName()+","+getAge());
    }
}
