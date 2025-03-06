package com.itheima.Test;

public class Test6 {
    //短路与，短路或（前边为真则后边不在运行）
    //单个逻辑运算符左右都运行
    public static void main(String[] args) {
        int a=10,b=10;
        boolean result=++a>10 || ++b<10;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
