package com.itheima.Test;

public class Test02 {
    public static void main(String[] args) {
        //比较两个长方形的面积。
        double sum1=getArea(5,10);
        double sum2=getArea(6,9);
        if (sum1>sum2){
            System.out.println("第一个面积大");
        }else {
            System.out.println("第二个面积大");
        }
    }
    public static double getArea(double len ,double width){
        double result=len*width;
        return result;
    }
}
