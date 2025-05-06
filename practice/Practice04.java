package com.itheima.practice;

public class Practice04 {
    public static void main(String[] args) {
        //把一组的元素复制到另一组上。
        /*
        1.定义一个老数组
        2.遍历老数组中的每一份元素。
        3.将老数组中的元素赋值给新数组。
         */
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] array=new int[arr.length];
        //i表示新数组的索引，也表示老数组的索引。
        for (int i = 0; i < arr.length; i++) {
                array[i]=arr[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
