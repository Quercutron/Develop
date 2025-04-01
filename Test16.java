package com.itheima.Test;

import java.util.Scanner;

public class Test16 {
      public static void main(String[] args) {
            //for 循环输入两个数，求范围内的数能被3和5整除的数的个数
            Scanner sc=new Scanner(System.in);
            System.out.println("开始数字：");
            int  one=sc.nextInt();
            Scanner sw=new Scanner(System.in);
            System.out.println("结束数字:");
            int  two=sw.nextInt();
            int sum=0;
            for (int i=one;i<=two;i++){
                 if (i%3==0 && i%5==0){
                       sum++;
                 }
            }
            System.out.println(sum);
      }
}
