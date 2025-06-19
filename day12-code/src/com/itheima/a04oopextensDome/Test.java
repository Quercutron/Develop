package com.itheima.a04oopextensDome;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer();
        lecturer.setId("001");
        lecturer.setName("张三");
        lecturer.work();

        Tutor tutor=new Tutor();
        tutor.setId("002");
        tutor.setName("李四");
        tutor.work();

        Maintainer maintainer=new Maintainer();
        maintainer.setId("003");
        maintainer.setName("王五");
        maintainer.work();

        Buyer buyer=new Buyer();
        buyer.setId("004");
        buyer.setName("马六");
        buyer.work();
    }
}
