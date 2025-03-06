package com.itheima.Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        输入两个整数与6比较，满足以下条件则输出true，否则输出false。
        1.a或者b为6
        2.a+b为6的倍数
         */
        Scanner first=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=first.nextInt();
        Scanner second=new Scanner(System.in);
        System.out.println("请输入第二个数字：");
        int b=second.nextInt();
        boolean result=(a==6 || b==6 || (a+b)%6==0);
        System.out.println(result);
    }
}
