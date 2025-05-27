package com.itheima.a03stactic;

import java.util.ArrayList;

public class StudentUtil {
    //工具类，求年龄最大
    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (max<age){
                max=age;
            }
        }
        return max;
    }
}
