package com.itheima.practice;

public class Practice07 {
    //数字加密
    //某数字密码（大于0）
    //规则：每位数加5，在对10进行取余，然后进行反转，得到一串新数字。
    /*
    1.键盘录入一个大于0的数字
    2.取得每一位数，然后进行加5，对10取余,批量操作使用数组
    3.进行反转，然后输出。
     */
    /*
    1.把整数放进数组中。
    2.对数组进行加密。
    3。输出最终结果。
     */
    public static void main(String[] args) {






        int[] arr={4,3,4,6};
        //加密
        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        //取余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        //反转
        for (int i =0,j=arr.length-1; i <j ; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //输出结果
        int number=0;
        for (int i = 0; i < arr.length; i++) {
            number=number*10+arr[i];
        }
        System.out.println(number);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
