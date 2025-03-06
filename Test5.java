package com.itheima.Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //比较两个数的大小，输出true或者false。
        Scanner man=new Scanner(System.in);
        System.out.println("请输入男士的时髦程度：");
        int a=man.nextInt();
        Scanner woman=new Scanner(System.in);
        System.out.println("请输入女士的时髦程度：");
        int b=woman.nextInt();
        System.out.println(a>=b);
        if (a>=b){
            System.out.println("相亲成功！");
        }else
            System.out.println("相亲失败。");
    }
}
