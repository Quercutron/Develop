package com.itheima.Test;

public class Test06 {
    //定义一个数组，从索引from到to的数组复制到新的数组中
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int[] newArr=copyOfRange(arr,2,5);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }


    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] array=new int[to-from];
        int idex=0;
        for (int i = from; i <to; i++) {
            array[idex]=arr[i];
            idex++;
        }
        return array;
    }
}
