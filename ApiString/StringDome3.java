package com.itheima.ApiString;

import java.util.Scanner;

public class StringDome3 {
    //已知正确的用户和密码，请用程序实现模拟用户登录。
    //总共三次机会，并给出相应提示。
    public static void main(String[] args) {
        String userName="abcde";
        String password="xuke";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请您输入账号：");
            String idName=sc.next();
            boolean result=userName.equals(idName);
            if (result){
                System.out.println("账号正确！");
                break;
            }else {
                System.out.println("第"+(i+1)+"次账号错误");
            }
        }


    }
}
