package com.itheima.practice;

import java.util.Random;

public class Practice11 {
    //奖池抽奖
    // 在{2,588,688,1000,10000}中随机且不重复的抽取全部的奖金。
    public static void main(String[] args) {
        /*
        1.不重复不能简单操作。
        2.定义数组来操作不重复。
        打乱数组内的元素
         */
        int[] arr = {2, 588, 688, 1000, 10000};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[0];
            arr[0]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
