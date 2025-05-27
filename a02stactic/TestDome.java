package com.itheima.a02stactic;

public class TestDome {
    public static void main(String[] args) {
        //测试工具类

        int[] arr={1,2,3,4,5,6};
        String printArr = ArrUtil.printArr(arr);
        System.out.println(printArr);

        double[] num={1.2,3.4,5.6,7.8};
        double printSum = ArrUtil.printSum(num);
        System.out.println(printSum);
    }
}
