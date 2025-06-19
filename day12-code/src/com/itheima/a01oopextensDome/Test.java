package com.itheima.a01oopextensDome;

public class Test {
    public static void main(String[] args) {
        zi z=new zi();
        z.look();
    }
}

class fu{
   String game="喝茶";
}

class zi extends fu{
    String game="打游戏";
    String name="张三";

    public void look(){
        //打印张三
        System.out.println(name);
        System.out.println(this.name);
        //打印游戏
        System.out.println(game);
        System.out.println(this.game);
        //打印喝茶
        System.out.println(super.game);
    }
}