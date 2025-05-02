package com.itheima.ArrayDome;

import java.util.Random;

public class Dome04 {
    public static void main(String[] args) {
        //定义一个1~5的数组随机打乱。
        int[] array={1,2,3,4,5};
        Random r=new Random();
        for (int i = 0; i <array.length ; i++) {
            int number=r.nextInt(array.length);
            int temp=array[i];
            array[i]=array[number];
            array[number]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
