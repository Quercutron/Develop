package com.itheima.ApiString;

public class StringDome10 {
    //StringBuilder容器对字符串进行操作
    public static void main(String[] args) {
        //创建StringBuilder空间
        StringBuilder sb=new StringBuilder();
        //添加，返回字符本身
        sb.append("abc");
        sb.append("bcd");
        System.out.println(sb);
        //链式编程
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
        //空间中的字符串长度
        int len=sb.length();
        System.out.println(len);
        //将StringBuilder里的内容转换成字符串
        String st=sb.toString();
        System.out.println(st);
    }
}
