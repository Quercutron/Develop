package com.itheima.ApiString;

public class StringDome2 {
    public static void main(String[] args) {
        //比较两个字符串对象
        String g1=new String("abc");
        String g2="abc";
        System.out.println(g1==g2);

        //equals方法，比较字符串内容是否相等。
        boolean result=g1.equals(g2);
        System.out.println(result);
        //忽略英文中的字母大小写
        boolean result2=g1.equalsIgnoreCase(g2);
        System.out.println(result2);
    }
}
