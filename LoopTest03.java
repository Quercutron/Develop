package com.itheima.LoopTest;

public class LoopTest03 {
    public static void main(String[] args) {
        //定义一个数组，求能被3整除的个数
        int[] array={1,3,5,7,8,10,12};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%3==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
