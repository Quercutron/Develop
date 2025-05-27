package com.itheima.a03stactic;

import java.util.ArrayList;

public class Test {
    //测试类
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student str1=new Student("张三",18,"女");
        Student str2=new Student("李四",19,"男");
        Student str3=new Student("王五",29,"男");

        list.add(str1);
        list.add(str2);
        list.add(str3);

        //年龄最大
        int maxAgeStudent=StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
