package com.itheima.methoddome;

public class MethodDome06 {
    public static void main(String[] args) {
        //带返回值方法的定义和调用
        //直接调用
        //getSum(10,20,30);
        //赋值调用
        //int sun=getSum(10,20,30);
        //System.out.println(sum);
        //输出调用
        System.out.println(getSum(10,20,30)/3);
    }
    public static double getSum(double one,double two,double three ){
        double result=one+two+three;
        return result;
    }
}
