package com.itheima.Practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请问你一共有多少钱：");
        int money=sc.nextInt();
        if (money>=100){
            System.out.println("网红餐厅！");
        }else{
            System.out.println("实惠的沙县小吃！");
        }
    }
}
