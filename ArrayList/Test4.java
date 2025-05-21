package com.itheima.ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();

        User u1=new User("heima001","zhangsan",18);
        User u2=new User("heima002","lisi",19);
        User u3=new User("heima003","wangwu",20);

        list.add(u1);
        list.add(u2);
        list.add(u3);

        if (contain(list,"heima004")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
    //定义一个方法，根据id查找对应的用户信息。并返回结果。
    public static boolean contain(ArrayList<User> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id)>=0;//判断是否大于1，相当于if判断语句
    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
