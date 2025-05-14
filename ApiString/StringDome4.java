package com.itheima.ApiString;

import javax.xml.transform.Result;

public class StringDome4 {
    //定义一个方法，对字符串进行拼接。
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String str=arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        if (arr==null){
            return "";
        }
        if (arr.length==0){
            return "[]";
        }
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr.length){
                result=result+arr[i]+"]";
            }else {
                result=result+arr[i]+", ";
            }
        }
        return result;
    }
}
