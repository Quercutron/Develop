package com.itheima.ApiString;

public class StringDome7 {
    public static void main(String[] args) {
        //获取一个手机号
        String phoneNumber="18337765145";
        //截取手机号的前三位
        String start=phoneNumber.substring(0,3);
        //截取手机号的后四位
        String end=phoneNumber.substring(7);
        //拼接
        String result=start+" **** "+end;
        //打印
        System.out.println(result);
    }
}
