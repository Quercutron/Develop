package com.itheima.ArrayDome;

import java.util.Random;

public class Dome02 {
    public static void main(String[] args) {
        //生成10个1~100之间的随机数存入数组。
        /*
        1.求出所有数据的和
        2.求出所有数据的平均数。
        3.查询有多少个数据比平均数小。
         */
        /*
        1.生成一个1~100的随机数
        2.生成10个随机数
        3.将随机数插入到数组中
        完成需求
         */
        int[] array=new int[10];
        Random ran=new Random();
        for (int i = 0; i < 10; i++) {

            int number=ran.nextInt(100)+1;
            array[i]=number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组第"+(i+1)+"个数是："+array[i]);
        }

        //求和
        int sum=0;
        for (int x = 0; x < array.length; x++) {
            sum=sum+array[x];
        }
        System.out.println("数组中的所有数据和为："+sum);
        //求平均值,保留了整数。
        int average=sum/array.length;
        System.out.println("数组中的所有数据的平均数为："+average);
        //查询低于平均数的个数。
        int min=0;
        for (int y = 0; y < array.length; y++) {
            if (array[y]<=average){
                min++;
            }
        }
        System.out.println("数组中的数据低于平均数的个数是："+min);
    }
}
