package com.itheima.Test;

public class Test01 {
    //使用重载的思想，设计比较两个整数是否相同。
    public static void main(String[] args) {
        //调用方法，形参和实参必须一一对应
        /*
        byte s1=10;
        byte s2=20;
        compare(s1,s2);
        */
        compare((short) 10,(short) 20);
    }
    public static void compare(byte a,byte b){
        System.out.println(a==b);
    }
    public static void compare(short a,short b){
        System.out.println(a==b);
    }
    public static void compare(int a, int b){
        System.out.println(a==b);
    }
    public static void compare(long a,long b){
        System.out.println(a==b);
    }
}
