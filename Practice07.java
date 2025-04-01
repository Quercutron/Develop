package com.itheima.Practice;

public class Practice07 {
    public static void main(String[] args) {
        //折纸次数
        double height=8844430;
        double i=0.1;
        int sum=0;
        while (i<height){
            i=i*2;
            sum++;
        }
        System.out.println(sum);
    }
}
