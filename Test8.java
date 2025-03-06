package com.itheima.Test;

import java.util.Scanner;

public class Test8 {
    //比较两只老虎的体重是否相同
    public static void main(String[] args) {
        Scanner one=new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int a=one.nextInt();
        Scanner two=new Scanner(System.in);
        System.out.println("请输入第二只老虎的体重：");
        int b=two.nextInt();
        String result=(a==b?"相同":"不相同");
        System.out.println("两只老虎的体重"+result);
    }

}
