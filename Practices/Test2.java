package com.itheima.Practices;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            char result=str.charAt(i);
            int num=result-'0';
            System.out.println(num);
        }

    }
}
