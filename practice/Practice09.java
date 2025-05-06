package com.itheima.practice;

public class Practice09 {
    //密码解密
    //加密过程：加5，对10取余，反转。
    //推测解密：反转，对10取余，减5
    public static void main(String[] args) {
        int[] arr={1,9,8,9};
        //反转
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //取余回溯
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0&&arr[i]<=4){
                arr[i]=arr[i]+10;
            }
        }
        //减5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //拼接
//        int temp=arr.length-1;//定义的循环次数
//        int a=0;//定义的数组索引
//        int number=0;//定义的数组接收值
//        while (temp==0){
//            number=number*10+arr[a];
//            a++;
//            temp--;
//        }
        int number=0;//定义的数组接收值
        for (int i = 0; i < arr.length; i++) {
            number=number*10+arr[i];
        }
        System.out.println(number);

    }
}
