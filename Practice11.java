package com.itheima.Practice;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        //键盘录入一个数，输出这个数的平方根
        /*
        例如：12
        3*3=9<12
        4*4=16<12
        12的平方根是3；
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i*i==number){
                System.out.println("这个数的平方根是"+i);
                break;
            }else if (i*i>number){
                System.out.println("这个数的平方根是"+(i-1));
                break;
            }
        }
    }
}
