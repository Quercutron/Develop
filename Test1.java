package com.itheima.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，并输出百位，十位，个位。
        System.out.println("请输入一个三位数：");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        System.out.println("百位是："+count/100);
        System.out.println("十位是："+count/10%10);
        System.out.println("个位是："+count%10);
    }
}
