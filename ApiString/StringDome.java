package com.itheima.ApiString;

import java.util.Scanner;

public class StringDome {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        //统计大小写字符数字出现的频率。（不考虑其他）
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c>='a' && c<='z'){
                smallCount++;
            }else if (c>='A'&&c<='Z'){
                bigCount++;
            }else if (c>='0'&&c<='9'){
                numberCount++;
            }
        }
        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }
}
