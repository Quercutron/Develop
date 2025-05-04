package com.itheima.Test;

public class Test04 {
    //设计一个方法求数组最大值，并将数组最大值返回
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int max=max(arr);
        System.out.println(max);
    }
    public static int max(int[] arr){
        int maxNumber=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNumber<arr[i]){
                maxNumber=arr[i];
            }
        }
        return maxNumber;
    }
}
