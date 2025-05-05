package com.itheima.practice;

import java.util.Scanner;

public class practice01 {
    //买机票
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket=sc.nextInt();
        System.out.println("月份");
        int month=sc.nextInt();
        System.out.println("请输入仓位：（0头等舱，1经济舱）：");
        int seat=sc.nextInt();
        if (month>=5 && month<=10){
            //旺季
             ticket=getPrice(ticket,seat,0.9,0.85);
            System.out.println(ticket);
        } else if ((month>=1 && month<=4) ||(month>=11&&month<=12)){
            //淡季
            ticket=getPrice(ticket,seat,0.7,0.6);
            System.out.println(ticket);
        } else {
            System.out.println("非法数据");
        }
    }
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if (seat==0){
            ticket=(int) (ticket*v0);
        }else if(seat==1) {
            ticket=(int) (ticket*v1);
        }
        return ticket;
    }
}
