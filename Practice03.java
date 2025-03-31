package com.itheima.Practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        //影院选座
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你座位号：");
        int select=sc.nextInt();
        if (select>=0 && select<=100){
            if (select/2 ==0){
                System.out.println("您应该坐左边");
            }else{
                System.out.println("您应该坐右边");
            }
        }else {
              System.out.println("无效票号！");
        }
    }

}
