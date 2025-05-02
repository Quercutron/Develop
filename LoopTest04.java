package com.itheima.LoopTest;

public class LoopTest04 {
    public static void main(String[] args) {
        /*
        定义一个数组，并遍历每一个数组元素。
        要求：
        1.如果是奇数，则将当前数字扩大两倍。
        2.如果是偶数，则将当前数字变成二分之一。
         */
        int[] array={1,3,5,7,8,10,12};
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                array[i]=array[i]/2;
            }else {
                array[i]=array[i]*2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
