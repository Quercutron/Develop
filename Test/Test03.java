package com.itheima.Test;

public class Test03 {
    //设计一个方法用于数组遍历，要求遍历结果是在一行。
    public static void main(String[] args) {
//        array();
        int[] number={11,22,33,44,55};
        printArray(number);
    }
//    public static void array(){
//        int[] arr={11,22,33,44,55};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
    public static void printArray(int[] arr){
                System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
