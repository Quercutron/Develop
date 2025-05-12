package com.itheima.Good2;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        //创建数组
       Goods[] arr=new Goods[3];

       //键盘录入
       Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Goods g=new Goods();
            //录入品牌
            System.out.println("请输入第"+(i+1)+"辆汽车的品牌：");
            String name=sc.next();
            g.setName(name);
            //录入价格
            System.out.println("请输入第"+(i+1)+"辆汽车的价格：");
            double price=sc.nextDouble();
            g.setPrice(price);
            //录入颜色
            System.out.println("请输入第"+(i+1)+"辆汽车的颜色：");
            String color=sc.next();
            g.setColor(color);
            //把本次的对象赋值给数组当中
            arr[i]=g;
        }
        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];
            System.out.println(goods.getName()+"," +goods.getPrice()+"," +goods.getPrice());

        }
    }
}
