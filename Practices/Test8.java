package com.itheima.Practices;

public class Test8 {
    public static void main(String[] args) {
        /*
        1.查表法。得到字符串的每一位字符
        2.将字符与字符表对应，返回下标
        3.用下表找到对应的数值下标，然后相加。
         */
        String s="MCMXCIV";
        char c;
        int index=0,number=0;
        char[] str1={'I','V','X','L','C','D','M'};
        int[] arr={1,5,10,50,100,500,1000};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str1.length; j++) {
                c=s.charAt(i);
                if (c==str1[j]){
                    index=j;
                }
            }
            number=number+arr[index];
        }
        System.out.println(number);
    }
}
