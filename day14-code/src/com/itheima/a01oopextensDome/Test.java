package com.itheima.a01oopextensDome;

public class Test {
    //多态
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("李四");
        t.setAge(18);

        Adminstrator a=new Adminstrator();
        a.setName("王五");
        a.setAge(18);

        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p){
        p.work();
    }
}
