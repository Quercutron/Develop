package com.itheima.ArrayDome;

public class Dome {
    public static void main(String[] args) {
        //定义一个数组，并打印出最大值。
        int[] array={1,2,3,4,6,5};
        //max必须是数组中的值。
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
