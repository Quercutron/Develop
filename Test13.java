package com.itheima.Test;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        //用户选择
        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入按键：");
        int number=sc.nextInt();
        switch (number){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            default:
                System.out.println("其他服务");
                break;
        }
    }
}
