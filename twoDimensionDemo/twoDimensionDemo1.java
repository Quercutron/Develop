package com.itheima.twoDimensionDemo;

public class twoDimensionDemo1 {
    /*
    静态初始化：
        格式：数据类型[][] 数组名=new 数据类型[][]{{元素1，元素2},{元素1，元素2}}
        简化：数据类型[][] 数组名={{元素1，元素2},{元素1，元素2}}
        例：int[][] arr={{ },{ }}
        反:	Int arr[][]={{ },{ }}
     */
    public static void main(String[] args) {
        int[][] arr1=new int[][]{{1,2},{3,4}};
        int[][] arr2={{1,2},{3,4}};
        int[][] arr3={
                {1,2},
                {3,4}
        };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
    }


}
