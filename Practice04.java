package com.itheima.Practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        //商品的价格
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的会员等级：");
        int pay=sc.nextInt();
        if (pay==1){
            System.out.println("您需要付："+1000*0.9+"元");
        }else if (pay==2){
            System.out.println("您需要付："+1000*0.8+"元");
        }else if (pay==3){
            System.out.println("您需要付："+1000*0.7+"元");
        }else{
            System.out.println("不打折，可以打骨折！");
        }
    }
}
