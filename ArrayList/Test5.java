package com.itheima.ArrayList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();

        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phones = getInfo(list);
        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i).getBrand()+","+phones.get(i).getPrice());
        }
    }
    //返回价格低于3000的手机信息
    //将信息放在集合中
    public static ArrayList<Phone> getInfo(ArrayList<Phone> list){
        ArrayList<Phone> phones=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<3000){
                phones.add(list.get(i));
            }
        }
        return phones;
    }
}
