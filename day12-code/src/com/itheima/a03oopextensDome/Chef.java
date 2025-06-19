package com.itheima.a03oopextensDome;

public class Chef extends Person{

    public Chef() {
    }

    public Chef(String number, String name, int pay) {
        super(number, name, pay);
    }

    @Override
    public void work(){
        System.out.println(getName()+"工作是炒菜");
    }
}
