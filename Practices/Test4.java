package com.itheima.Practices;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    //输入字符串，随机打乱顺序
    public static void main(String[] args) {
        /*
        1.键盘录入
        2.检验输入数据是否符合
        3.循环字符串的每一位，与随机位置交换
        4.输出最终结果
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        if (check(str)){
            System.out.println("输入正确");
        }else {
            System.out.println("输入错误");
        }
        String s=randomString(str);
        System.out.println(s);

    }
    //检查字符串是否符合
    public static boolean check(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str==null){
                return false;
            }
            if (c<'a'||c<'Z'){
                return false;
            }
        }
        return true;
    }
    //随即交换位置
    public static String randomString(String str){
        char[] arr=str.toCharArray();
        char c;
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int anInt = r.nextInt(str.length());
            c=arr[i];
            arr[i]=arr[anInt];
            arr[anInt]=c;
        }
        String s=new String(arr);
        return s;
    }
}
