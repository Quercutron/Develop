package com.itheima.a02stactic;

public class ArrUtil {
    //私有化成员方法
    private ArrUtil(){

    }

    //打印数组
    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    //求平均值
    public static double printSum(double[] num){
        double sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        return sum/num.length;
    }
}
