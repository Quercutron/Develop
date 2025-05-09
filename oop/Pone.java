package com.itheima.oop;

public class Pone {
    //私有化：保证数据的安全性
    private String blond;
    //针对每个私有化变量都要提供set和get方法
    //set：给成员变量赋值
    //get对外提供成员变量的值
    public void setBlond(String a){
        blond=a;
    }
    public String getBlond(){
        return blond;
    }

    int prize;
    public void setPrize(int p){
        if (p>0){
            prize=p;
        }else {
            System.out.println("无效数据");
        }
    }
    public int getPrize(){
        return prize;
    }



    public void playGame(){
        System.out.println("对象正在打游戏");
    }
}
