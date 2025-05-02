package com.itheima.LoopTest;

public class LoopTest02 {
    public static void main(String[] args) {
        //存储一个数组，并求和
        int[]  array={1,2,3,4,5};
        int sum=0;
        //遍历每个数
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
