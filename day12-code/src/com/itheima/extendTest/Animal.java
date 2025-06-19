package com.itheima.extendTest;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+"在吃饭");
    }
    public void drink(){
        System.out.println(name+"在喝水");
    }

}
