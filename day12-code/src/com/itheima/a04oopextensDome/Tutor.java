package com.itheima.a04oopextensDome;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }
    @Override
    public void work(){
        System.out.println("编号是："+getId()+","+getName()+"的工作是：助教");
    }
}
