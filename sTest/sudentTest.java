package com.itheima.sTest;

public class sudentTest {
    public static void main(String[] args) {
        Sudent s=new Sudent();
        s.setName("张三");
        System.out.println(s.getName());
        s.setAge(18);
        System.out.println(s.getAge());

        Sudent s2=new Sudent("lisi",25);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
