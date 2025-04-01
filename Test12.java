package com.itheima.Test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        //录入星期，输入计划。
        Scanner sc=new Scanner(System.in);
        System.out.println("请问今天周几：");
        String day=sc.next();
        switch (day){
            case "周一":
                System.out.println("周一打折");
                break;
            case "周二":
                System.out.println("周二听歌");
                break;
            case "周三":
                System.out.println("周三打游戏");
                break;
            case "周四":
                System.out.println("疯狂星期四！");
                break;
            case "周五":
                System.out.println("放假！");
                break;
            default:
                System.out.println("周末春游！");
                break;
        }
    }
}
