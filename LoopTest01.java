package com.itheima.LoopTest;

import java.util.Random;
import java.util.Scanner;

public class LoopTest01 {
    public static void main(String[] args) {
        //随机生成一个0~100的数字，程序实现猜数字小游戏。
        //不能写在循环内。
        //扩展：添加保底机制。
        int count=0;
        Random r=new Random();
        int Number=r.nextInt(100)+1;
        System.out.println(Number);
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber=sc.nextInt();
            count++;
            if (count==3){
                System.out.println("你猜对了！");
                break;
            }
            if (guessNumber>Number){
                System.out.println("大了");
            }else if (guessNumber<Number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了！");
                break;
            }
        }
    }
}
