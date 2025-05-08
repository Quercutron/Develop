package com.itheima.oop;

public class PoneTest {
    public static void main(String[] args) {
        //创建对象
        Pone p=new Pone();
        //给对象赋值
        p.blond="小米";
        p.prize=1800;

        //调用对象
        System.out.println(p.blond);
        System.out.println(p.prize);

        //调用对象方法
        p.playGame();

        //创建对象
        Pone huaWei=new Pone();
        //给对象赋值
        huaWei.blond="华为";
        huaWei.prize=1888;

        //调用对象
        System.out.println(huaWei.blond);
        System.out.println(huaWei.prize);
    }
}
