package com.itheima.Practice;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        //回文数字：将数字反过来对比一下
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的回文数字：");
        int x=sc.nextInt();
        int num=0;
        int temp=x;
        while (x!=0){
            int ge=x%10;//4
            x=x/10;//123
            num=num*10+ge;//4,43,432,4321
        }
        System.out.println(num==temp);
    }
}
