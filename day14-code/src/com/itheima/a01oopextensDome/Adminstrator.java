package com.itheima.a01oopextensDome;

public class Adminstrator extends Person{
    public Adminstrator() {
    }

    public Adminstrator(String name, int age) {
        super(name, age);
    }
    @Override
    public void work(){
        System.out.println("管理员是"+getName()+","+getAge());
    }
}
