package com.itheima.practice;

import java.util.Random;

public class Practice03 {
    //开发验证码
    /*
    定义方法实现随机产生一个5为的验证码
    格式：长度为5.前四位是大写或者小写字母。最后一位是数字。
     */
    public static void main(String[] args) {
        //定义一个包含大小写字母的数组。
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i<26){
                chs[i]=(char)(97+i);
            }else {
                chs[i]=(char)(65+i-26);
            }
        }
        String result="";
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex=r.nextInt(chs.length);
//            System.out.println(chs[randomIndex]);
            result=result+chs[randomIndex];
        }
        int number= r.nextInt(10);
        result=result+number;
        System.out.println(result);


//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
//        }
    }
}
