package com.itheima.Good;

public class GoodsTest {
    public static void main(String[] args) {
        //定义数组
        Goods[] arr=new Goods[3];
        //三个商品属性
        Goods g1=new Goods("001","HUAWEI",1888.88,50);
        Goods g2=new Goods("001","格力空调",3666.6,60);
        Goods g3=new Goods("001","海尔洗衣机",888.8,70);
        //把商品加入到数组中
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];//Goodes引用数据类型
            System.out.println(goods.getId()+"," +goods.getName()+"," +goods.getPrice()+","+goods.getCount());
        }
    }
}
