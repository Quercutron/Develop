package com.itheima.Test;

public class Test15 {
    public static void main(String[] args) {
        //累加求和
        int a=0;
        for (int i=1;i<=100;i++){
            System.out.println(i);
            a=a+i;
        }
        System.out.println(a);
        //偶数累加
        int sum=0;
        for (int j = 1; j <= 100; j++) {
            if (j%2==0){
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}
