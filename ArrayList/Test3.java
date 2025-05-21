package com.itheima.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student str=new Student();
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age=sc.nextInt();

            str.setName(name);
            str.setAge(age);

            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            Student str=list.get(i);
            System.out.println(str.getName()+","+str.getAge());
        }
    }
}
