package com.itheima.Practices;

import com.sun.deploy.panel.ITreeNode;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        1.检查数据是否符合要求
        2.遍历字符串中的每一个字符
        3.将字符转换为整数
        4.将整数传入查表法，返回对应字符
        5.把字符串接起来。
         */
        Scanner sc=new Scanner(System.in);
        String number;
        while (true){
            System.out.println("请输入一个小于等于9的字符串：");
            number=sc.next();
            if (chick(number)){
                break;
            }else {
                System.out.println("数据错误！");
            }
        }
        //2.遍历字符串中的每一个字符
//        String strs="";
         StringBuilder result=new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c=number.charAt(i);
            int num = c-48;
            result.append(numToString(num));
//            strs=strs+numToString(num);
        }
//        System.out.println(strs);
        System.out.println(result);
    }
    //1.检查数据是否符合要求.
    public static boolean chick(String number){
        if (number.length()>9){
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            char c=number.charAt(i);
            if (c<'0' || c>'9'){
                return false;
            }
        }
        return true;
        //只有所有字符都判断完了，才能认为当时的字符串符合规则。
    }
    //定义方法对字符串进行查图法
    public static String numToString(int number){
//        StringBuilder sb=new StringBuilder();
//        sb.append(number).toString();
        String[] str={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
            return str[number];

    }
}
