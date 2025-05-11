package com.itheima.Game;

public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role();
        Role r2=new Role();

        r1.setName("乔峰");
        r1.setBlood(100);
        r2.setName("鸠摩智");
        r2.setBlood(100);

        while (true){
            r1.attick(r2);
            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }

            r2.attick(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }

    }
}
