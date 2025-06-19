package com.itheima.a04oopextensDome;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, String job) {
        super(id, name, job);
    }
    @Override
    public void work(){
        System.out.println("编号是："+getId()+","+getName()+"的工作是：采购专员");
    }
}
