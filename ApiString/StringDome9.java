package com.itheima.ApiString;

public class StringDome9 {
    //敏感词替换
    public static void main(String[] args) {
        //定义一句话
        String str="你真是个sb，你玩nm呢？回去再练练吧";
        String[] arr={"sb","nm","cnm","gch"};
        for (int i = 0; i < arr.length; i++) {
            str=str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
