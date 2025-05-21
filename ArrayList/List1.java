package com.itheima.ArrayList;

import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Nice");
        list.add("to");
        list.add("see");
        list.add("you");
        System.out.println(list);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
