package com.itheima.a03oopextensDome;

public class Manager extends Person{
    String managerMoney;

    public Manager() {
    }

    public Manager(String number, String name, int pay, String managerMoney) {
        super(number, name, pay);
        this.managerMoney = managerMoney;
    }

    public String getManagerMoney() {
        return managerMoney;
    }

    public void setManagerMoney(String managerMoney) {
        this.managerMoney = managerMoney;
    }

    @Override
    public void work(){
        System.out.println(getName()+"工作是管理其他人");
    }
}
