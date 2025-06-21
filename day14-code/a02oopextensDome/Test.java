package com.itheima.a02oopextensDome;

public class Test {
    public static void main(String[] args) {
//        Person p=new Person("老王",35);
//        Dog d=new Dog(2,"黑");
//        p.keepPet(d,"骨头");
//
//        Person person=new Person("老李",25);
//        Cat c=new Cat(3,"灰");
//        p.keepPet(c,"鱼");

        Person p=new Person("老王",35);
        Animal d=new Dog(2,"黑");
        Animal c=new Cat(3,"灰");

        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");

    }
}
