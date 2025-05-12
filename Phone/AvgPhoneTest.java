package com.itheima.Phone;

import com.itheima.Good2.Goods;

public class AvgPhoneTest {
    public static void main(String[] args) {
        AvgPhone[] arr=new AvgPhone[3];
        AvgPhone avg1=new AvgPhone("华为",1888,"白色");
        AvgPhone avg2=new AvgPhone("荣耀",2228,"黑色");
        AvgPhone avg3=new AvgPhone("小米",888,"蓝色");

        arr[0]=avg1;
        arr[1]=avg2;
        arr[2]=avg3;

        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getPrice();
        }
        double avg=sum/ arr.length;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getPrice();
            if (avg>arr[i].getPrice()){
                count++;
            }

        }

        System.out.println(avg);
        System.out.println(count);
    }
}
