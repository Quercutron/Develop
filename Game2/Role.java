package com.itheima.Game2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {

    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        //随即样貌
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //随机获得数组中的相貌
        Random r=new Random();
        if (gender=='男'){
            int index=r.nextInt(boyfaces.length);//索引
            this.face=boyfaces[index];

        }else if(gender=='女') {
            int index=r.nextInt(girlfaces.length);//索引
            this.face=girlfaces[index];
        }else {
            this.face = "面目狰狞";
        }

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
    public void attick(Role role){//this传递的地址值Role是地址值
        //攻击效果
        Random r=new Random();
        int index=r.nextInt(attacks_desc.length);
        String KongFu=attacks_desc[index];
        System.out.printf(KongFu,this.name,role.name);//输出功夫样式

        //定义随机伤害。
        int hurt=r.nextInt(20)+1;
        //记录剩余血量
        int remainDlood=role.getBlood()-hurt;
        //验证剩余血量
        remainDlood=remainDlood<0?0:remainDlood;
        //修改被打人的血量
        role.setBlood(remainDlood);

        System.out.println(this.name+"造成了"+hurt+"点伤害，");

        if (remainDlood>90){
            System.out.printf(injureds_desc[0],role.name);
        }else if (remainDlood>80&&remainDlood<=90){
            System.out.printf(injureds_desc[1],role.name);
        }else if (remainDlood>70&&remainDlood<=80){
            System.out.printf(injureds_desc[2],role.name);
        }else if (remainDlood>50&&remainDlood<=70){
            System.out.printf(injureds_desc[3],role.name);
        }else if (remainDlood>30&&remainDlood<=50){
            System.out.printf(injureds_desc[4],role.name);
        }else if (remainDlood>20&&remainDlood<=30){
            System.out.printf(injureds_desc[5],role.name);
        }else if (remainDlood>10&&remainDlood<=20){
            System.out.printf(injureds_desc[6],role.name);
        }else {
            System.out.printf(injureds_desc[7],role.name);
        }

        //显示状态
        System.out.println(role.name+"还剩下"+remainDlood+"点血。");

//        System.out.println(this.name+"打了"+role.name+"一下，"
//                +this.name+"造成了"+hurt+"点伤害，"
//                +role.name+"还剩下"+remainDlood+"点血。");
    }

    //角色信息展示
    public void showRoleInfo(){
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+getGender());
        System.out.println("样貌为:"+getFace());
    }

}
