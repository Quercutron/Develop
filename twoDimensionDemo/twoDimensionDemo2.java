package com.itheima.twoDimensionDemo;

public class twoDimensionDemo2 {
    public static void main(String[] args) {
        int[][] yearArrArr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum=0;
        for (int i = 0; i < yearArrArr.length; i++) {
            //输出每一个季度的营业额。
            int[] quarterArr=yearArrArr[i];//把二维数组中的每一个一维数组赋值给int[] quarter
            int sum=getSum(quarterArr);//每一个数组的总和
            System.out.println("第"+(i+1)+"个季度的营业额为："+sum);
            yearSum=yearSum+sum;
        }
        System.out.println(yearSum);
    }
    public static int getSum(int[] arr){
        //计算每一个一维数组的总和。
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];//{22,66,44}相加
        }
        return sum;
    }
}
