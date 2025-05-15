package com.itheima.ApiString;

public class StringDome8 {
    public static void main(String[] args) {
        //获取身份证信息。打印年月日，性别
        String id="411381200009056114";
        String year=id.substring(6,10);
        System.out.print(year+"年");
        String month=id.substring(10,12);
        System.out.print(month+"月");
        String day=id.substring(12,14);
        System.out.print(day+"日");
        //利用ASCLL码表对字符串转换成整数类型'0'--48
        char c=id.charAt(16);
        int num=c-48;
        if (num%2==0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }

    }
}
