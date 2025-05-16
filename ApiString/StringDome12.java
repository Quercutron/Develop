package com.itheima.ApiString;

public class StringDome12 {
    //利用StringBuilder对字符串进行拼接
    //如int[] arr={1,2,3} 输出[1,2,3]
    public static void main(String[] args) {
        int[] arr={1,2,3};
        arrToString(arr);
    }
    public static void arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
