package com.itheima.practice;

import java.util.Random;

public class Practice10 {
    //奖池抽奖
    // 在{2,588,688,1000,10000}中随机且不重复的抽取全部的奖金。
    public static void main(String[] args) {
        /*
        1.不重复不能简单操作。
        2.定义数组来操作不重复。
         */
        int[] arr={2,588,688,1000,10000};
        int[] newArr=new int[arr.length];
        Random r=new Random();
        for (int i = 0; i < arr.length;) {
            int randomIndex=r.nextInt(arr.length);
            int prize=arr[randomIndex];
            //不重复
            if (!contains(newArr,prize)){//实参（新数组，上面随机抽取的老数组元素）
                newArr[i]=prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
    //定义一个是否重复的方法，
    //在新数组中查询是否有一个和抽取的相同。
    public static boolean contains(int[] newArr,int prize){//形参（新数组，抽取元素）
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i]==prize) {
                return true;
            }
        }
        return false;
    }
}
