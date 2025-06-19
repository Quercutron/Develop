package com.itheima.a03oopextensDome;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setNumber("001");
        manager.setName("张三");
        manager.setPay(8000);
        System.out.println(manager.getName()+manager.getNumber()+manager.getPay());
        manager.work();
        manager.eat();


        Chef chef=new Chef();
        chef.setNumber("002");
        chef.setName("李四");
        chef.setPay(10000);
        System.out.println(chef.getName()+chef.getNumber()+chef.getPay());
        chef.work();
        chef.eat();


    }
}
