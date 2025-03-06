package com.itheima.Test;

public class Test9 {
    public static void main(String[] args) {
        //比较三个元素的大小
        //三元表达式复杂
        int a=150,b=210,c=165;
        String reslut=(a>b?(a>c?"大和尚":"小和尚"):(b>c? "二和尚" :"小和尚"));
        System.out.println(reslut+"最高!");

        //赋值给值
        int height1=150;
        int height2=210;
        int height3=165;
        int temp=height1>height2?height1:height2;
        int height=temp>height3?temp:height3;
        System.out.println(height);


    }
}
