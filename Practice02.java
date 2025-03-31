package com.itheima.Practice;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        //商品付款
        int money=600;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入顾客付款金额：");
        int payMoney=sc.nextInt();
        if (money<=payMoney){
            if (money<payMoney){
                System.out.println("多了！");
            }else System.out.println("付款成功！");
        }else System.out.println("付款失败！");
    }
}
