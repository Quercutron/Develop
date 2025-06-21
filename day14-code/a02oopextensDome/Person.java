package com.itheima.a02oopextensDome;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    //喂养狗
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一直"+dog.getColor()+"颜色"+dog.getAge()+"岁的狗");
//        dog.eat(something);
//    }
//
//    //喂养猫
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一直"+cat.getColor()+"颜色"+cat.getAge()+"岁的狗");
//        cat.eat(something);
//    }

        //喂养动物
        public void keepPet(Animal a,String something){
                if (a instanceof Dog){
                    Dog d=(Dog) a;
                    System.out.println("年龄为"+age+"岁的"+name+"养了一直"+a.getColor()+"颜色"+a.getAge()+"岁的狗");
                    d.eat(something);
                }else if (a instanceof Cat) {
                    Cat c=(Cat) a;
                    System.out.println("年龄为" + age + "岁的" + name + "养了一直" + a.getColor() + "颜色" + a.getAge() + "岁的狗");
                    c.eat(something);
                }else {
                    System.out.println("没有这种动物");
                }
            }
}
