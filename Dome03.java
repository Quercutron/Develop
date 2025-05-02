package com.itheima.ArrayDome;

public class Dome03 {
    public static void main(String[] args) {
        //定义一个数组，交换首尾元素。
        /*
        思路：定义一个额外变量
        将首元素赋值给变量
        然后将尾元素赋值给首元素
        再将额外变量赋值给为元素
        最后遍历出来
         */
        int[] array={1,2,3,4,5};
        int temp=0;
        temp=array[0];
        array[0]=array[4];
        array[4]=temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        //定义一个数组，交换颠倒元素。
        int[] arr={2,3,4,5,6};
        //利用指针来交换元素。
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int x=0;
            x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
