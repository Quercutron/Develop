package com.itheima.extendTest;

public class Test {
    public static void main(String[] args) {
        Lihua lihua=new Lihua();
        lihua.name="狸花猫";
        lihua.eat();
        lihua.drink();
        lihua.catchMouse();

        Ragdoll ragdoll=new Ragdoll();
        ragdoll.name="布偶猫";
        ragdoll.eat();
        ragdoll.drink();
        ragdoll.catchMouse();

        Teddy teddy=new Teddy();
        teddy.name="泰迪";
        teddy.eat();
        teddy.drink();
        teddy.lookHome();
        teddy.touch();
    }
}
