package com.itheima.practice;

import java.util.Random;

public class Practice05 {
    //评委打分
    public static void main(String[] args) {
        //六名评委打分，范围是0-100之间的整数元首的最后得分去点最高和最低后的平均值。
        /*
        1.随机生成一个0-100之间的数
        2.生成6个随机数。
        3.求出最高和最低分去掉。
        4.求剩下的四个平均数。
         */
        Random r=new Random();
        int[] arr=new int[6];
        for (int i = 0; i < 6; i++) {
            int random=r.nextInt(101);
            arr[i]=random;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result+arr[i];
        }
        int number=0;
         result=result-max-min;
        number=(int) (result/4);
        System.out.println(number);
    }
}
