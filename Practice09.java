package com.itheima.Practice;

public class Practice09 {
    public static void main(String[] args) {
        //不使用乘除取模求出商和余数
        int b=10;
        int c=3;
        int s=0;
        while (b>c){
            b=b-c;
            s++;
        }
        System.out.println("商是："+s);
        System.out.println("余数是："+b);
    }
}
