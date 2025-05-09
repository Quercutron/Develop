package com.itheima.oop;

public class PoneTest {
    public static void main(String[] args) {
        //创建对象
        Pone p=new Pone();
        //给对象赋值
        p.setBlond("小米");
        //p.prize=1800;
        p.setPrize(1800);
        //调用对象
        System.out.println(p.getBlond());
        System.out.println(p.getPrize());

        //调用对象方法
        p.playGame();
        //创建对象


        Pone huaWei=new Pone();
        //给对象赋值
        huaWei.setBlond("华为");
        huaWei.setPrize(1888);

        //调用对象
        System.out.println(huaWei.getBlond());
        System.out.println(huaWei.getPrize());
    }
}
