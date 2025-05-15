package com.itheima.ApiString;

public class StringDome1 {
    public static void main(String[] args) {
        //直接赋值
        String s1="abc";
        //空参传递
        String s2=new String();


        //字符数组传递，根据字符数组的内容在创建一个新的字符串对象。
        //可以修改字符串的内容
        char[] chs={'a','b','c'};
        String s3=new String(chs);
        //字节数组传递，根据字节数组的内容在创建一个新的字符串对象。
        //网络传输的数据都是字节信息
        byte[] byts={97,98,99,100};
        String s4=new String(byts);
        //abcd
    }
}
