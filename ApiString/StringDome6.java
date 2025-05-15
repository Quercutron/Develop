package com.itheima.ApiString;

import java.util.Scanner;

public class StringDome6 {
    //金额转换
    /*
    1.键盘录入一个整数
    2.校验录入数据是否合法
    3.获得每一位数字
    4.通过查表法将数字转换成相应的汉字
    5.使用for循环的到每一位汉字，然后进行拼接。
    6.通过charAt来获取字符传中每一位汉字和单位进行拼接
    7.输出拼接字符串。
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int count=0;
        while (true){
            System.out.println("请输入一个整数：");
            //局部变量
            num=sc.nextInt();
            if (num>=0&&num<=9999999){
               break;
            }else {
                System.out.println("无效数字!");
            }
        }
        String temp="";
        while (count<7){
            int ge=num%10;
            temp=getMoney(ge)+temp;
            num/=10;
            count++;
        }
        System.out.println(temp);
        String result="";
        String[] strs={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            result=result+c+strs[i];
        }
        System.out.println(result);

    }
    public static String getMoney(int number){
        String[] str={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return str[number];
    }

}
