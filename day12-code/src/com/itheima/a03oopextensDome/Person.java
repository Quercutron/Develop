package com.itheima.a03oopextensDome;

public class Person {
    private String number;
    private String name;
    private int pay;

    public Person() {
    }

    public Person(String number, String name, int pay) {
        this.number = number;
        this.name = name;
        this.pay = pay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void work(){
        System.out.println(getName()+"工作");
    }
    public void eat(){
        System.out.println(getName()+"吃米饭");
    }
}
