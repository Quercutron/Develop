package com.itheima.Practice;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        //键盘录入一个正整数，判断该数是否是一个质数
        //质数：如果一个数只能被1和它本身整除，那么它就是一个质数，否则为合数
        //只有所有数都判断完了才能判断其是否为质数
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number=sc.nextInt();
        for (int i = 2; i < 10; i++) {
            if (number%i ==0){
                flag=false;
            }
        }
        if (flag){
            System.out.println("该数字不是一个质数");
        }
        else System.out.println("该数字是一个质数");
    }
}
