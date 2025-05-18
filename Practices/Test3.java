package com.itheima.Practices;

public class Test3 {
    public static void main(String[] args) {
        //字符串旋转
        //旋转若干次之后和另一个字符串比较，返回结果
        String strA="abcde";
        String strB="eabcd";
        System.out.println(rotate(strA));
        //旋转若干次，每次都与b字符串比较，返回结果
        boolean result=check(strA,strB);
        System.out.println(result);
    }
    //比较字符串是否会相同
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            //每次都会改变a字符串，每次也会比较
            //若有一次相同，则返回true。
            strA=rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    //定义一个方法旋转字符串（将第一个字符串放到最后一个位置上去）
    public static String rotate(String strA){
        //截取第一位，放到最后去
        //把字符串放到数组中，挪动指针。
        char c=strA.charAt(0);
        String end=strA.substring(1);
        return end+c;
    }
}
