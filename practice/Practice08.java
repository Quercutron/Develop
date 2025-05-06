package com.itheima.practice;

public class Practice08 {
    //把整数的每一位都添加到数组中。反向推导
    /*
    1.计算出数组的长度
    2.定义一个数组
    3.把数组的每一位添加到数组中。
     */
    public static void main(String[] args) {
        //1
        int number=1998;
        int temp=number;
        int count=0;
        while (number!=0){
            number=number/10;
            System.out.println(number);
            count++;
        }
        //在第一次循环中获取了个位的值，接着去掉个位
        // 变成一个小一位的值，在获取这个值的最小位，以此类推
        System.out.println(count);
        int[] arr=new int[count];
        //或者arr.length-1
        int i=count-1;
        while (temp!=0){
            int ge=temp%10;
            temp=temp/10;
            arr[i]=ge;
            i--;
        }
        for (int j = 0; j< arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    }
}
