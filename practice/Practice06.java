package com.itheima.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
          /*
        1.随机生成一个0-100之间的数
        2.生成6个随机数。
        3.求出最高和最低分去掉。
        4.求剩下的四个平均数。
         */
        int[] score=getScores();
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        int max=getmax(score);
        int min=getmin(score);
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            sum=sum+score[i];
        }
        int avg=(int) ((sum-max-min)/(score.length-2));
        System.out.println(avg);

    }
    public static int getmax(int[] score){
        //方法调用，求最大值
        int max=score[0];
        for (int i = 1; i < score.length; i++) {
            if (max<score[i]){
                max=score[i];
            }
        }
        return max;
    }
    public static int getmin(int[] score){
        //方法调用，求最小值
        int min=score[0];
        for (int i = 1; i < score.length; i++) {
            if (min<score[i]){
                min=score[i];
            }
        }
        return min;
    }
    public static int[] getScores(){
        //键盘录入六个分数，并记录进数组，返回。
        //设置限制。
        int[] scores=new int[6];
        Scanner r=new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入你的分数：");
            int score=r.nextInt();
            if (score>=0&&score<=100){
                scores[i]=score;
                i++;
            }else {
                System.out.println("无效分数分数：");
            }
        }
        return scores;
    }

}
