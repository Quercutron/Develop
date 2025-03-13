package com.itheima.Test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你能喝多少：");
        int drink=sc.nextInt();
        if (drink>10){
            System.out.println("小伙子可以啊！");
    }
        else System.out.println("小伙子你行不行啊？");
    }
}
