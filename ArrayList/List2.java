package com.itheima.ArrayList;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);

        list.add(s1);
        list.add(s2);
        list.add(s3);

//        System.out.println(list);返回的地址值
        for (int i = 0; i < list.size(); i++) {
            Student str=list.get(i);
            System.out.println(str.getName()+","+str.getAge());
        }

    }
}
