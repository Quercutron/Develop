package com.itheima.Game;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击
    //
    public void attick(Role role){//this传递的地址值Role是地址值
        //定义随机伤害。
        Random r=new Random();
        int hurt=r.nextInt(20)+1;

        //记录剩余血量
        int remainDlood=role.getBlood()-hurt;
        //验证剩余血量
        remainDlood=remainDlood<0?0:remainDlood;
        //修改被打人的血量
        role.setBlood(remainDlood);

        System.out.println(this.name+"打了"+role.name+"一下，"
                +this.name+"造成了"+hurt+"点伤害，"
                +role.name+"还剩下"+remainDlood+"点血。");
    }

}
