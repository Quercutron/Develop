package com.itheima.Practice;

import org.w3c.dom.css.Counter;

public class Practice10 {
    public static void main(String[] args) {
        //逢7过
        //7的倍数,个位是7，十位是7
        for (int i=1;i<100;i++){
            if (i%7==0 || i%10==7 || i/10==7 ){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
