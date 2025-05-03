package com.itheima.methoddome;

public class MethodDome05 {
    public static void main(String[] args) {
        //求长方形的周长，将结果进行打印
        getLength(1.2,1.3);
    }
    public static void getLength(double len,double width ){
        double result=(len+width)*2;
        System.out.println(result);
    }
}
