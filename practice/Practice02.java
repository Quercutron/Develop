package com.itheima.practice;

public class Practice02 {
    //判断101-200之间有多少素数，并输出所有素数。
    //素数：除了能被它本身和1整除，没有其他因数。
    public static void main(String[] args) {
        //1.判断一个数是否为质数
        //2.放入循环判断每个数。
        //3.定义一个变量记录质数个数。
        //4.在循环中打印每个质数。
        int sum=0;
        for (int i = 101; i <=200; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
