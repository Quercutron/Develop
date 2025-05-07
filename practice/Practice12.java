package com.itheima.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice12 {
    //双色球中奖
    /*
    1.生成中奖号码，有6个红色球（33取6）加1个蓝色球（16取1）
    2.将中奖号码存入数组中。
    3.玩家输入彩票号码。在六个求红球数组中求相似，1个在蓝球中求相似。
    4.根据红篮球中奖个数，输出奖金。
     */
    public static void main(String[] args) {
        int[] arr=creatNumber();//中奖号码
        System.out.print("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        //生成玩家中奖数组
        int[] userArr=userInputNumber();
        System.out.println("用户彩票号码为：");
        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i]+" ");
        }
        System.out.println("\n");
        ////比较两个数组的前六位和最后一位。
        int redCount=0;
        int blueCount=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i]==userArr[j]){
                    redCount++;
                }
            }
        }
        if (arr[arr.length-1]==userArr[userArr.length-1]){
            blueCount++;
        }
        //计算用户奖金。
        String money=prize(redCount,blueCount);
        System.out.println(money);
    }
    public static int[] userInputNumber(){
        //玩家输入的号码。
        int[] userArr=new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码（1-33）：");
            int userRedNumber=sc.nextInt();
            boolean flag=contains(userArr,userRedNumber);
            if ((userRedNumber>0&&userRedNumber<=33)&&(!flag)){
                userArr[i]=userRedNumber;
                i++;
            }else {
                System.out.println("输入号码无效！");
            }
        }
        System.out.println("请输入蓝球号码（1-16）：");
        while (true){
            int userBlueNumber=sc.nextInt();
            if (userBlueNumber>0&&userBlueNumber<=16){
                userArr[userArr.length-1]=userBlueNumber;
                break;
            }else {
                System.out.println("无效号码，请重新输入蓝球号码（1-16）：");
            }
        }
        return userArr;

    }
    public static int[] creatNumber(){
        //生成中将号码
        int[] arr=new int[7];
        Random r=new Random();
        //生成红球
        for (int i = 0; i < 6; ) {
            //红球不能重复
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            if (!flag){
                arr[i]=redNumber;
                i++;
            }
        }
        //生成蓝球
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;
        return arr;
    }
    public static boolean contains(int[] arr,int redNumber){
        //判断数组中是否有重复的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==redNumber){
                return true;
            }
        }
        return false;
    }

    public static String prize(int redCount,int blueCount) {
        String money="";
        if (blueCount==1){
            switch (redCount){
                case 6:money="1000万元";break;
                case 5:money="3000元";break;
                case 4:money="200元";break;
                case 3:money="10元";break;
                case 2:money="5元";break;
                case 1:money="5元";break;
                case 0:money="5元";break;
            }
        }else {
            switch (redCount) {
                case 6:
                    money = "500万元";
                    break;
                case 5:
                    money = "200元";
                    break;
                case 4:
                    money = "10元";
                    break;
                default:
                    money = "谢谢惠顾，欢迎再来.";
            }
        }
        return money;
    }
}
