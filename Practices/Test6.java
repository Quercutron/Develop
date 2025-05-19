package com.itheima.Practices;

public class Test6 {
    public static void main(String[] args) {
        //给定两个非负整数的字符串，求两字符串的乘积
        /*
        1.定义两个非负整数的字符串
        2.定义方法得到字符串中的数字
        3.将数字相乘输出
         */
         String num1="12345";
         String num2="6789";
        System.out.println(num1.charAt(0)-48);
        int result=number(num1)*number(num2);
        System.out.println(result);

    }
    //得到字符串中的数字，转化为字符数组->得到每一位字符->将字符累加。
    public static int number(String num){
        char[] arr=num.toCharArray();
        int number,result=0;
        for (int i=0;i<arr.length;i++) {
            number=arr[i]-48;
            result=result*10+number;
        }
        return result;
    }
}
