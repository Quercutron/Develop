package com.itheima.a01stactic;

public class StudentTest {
    public static void main(String[] args) {

        Student.teacherName="阿伟";

        Student student1=new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setGender("男");
//        student1.teacherName="阿伟";

        student1.study();
        student1.show();

        Student student2=new Student();
        student2.setName("李四");
        student2.setAge(19);
        student2.setGender("男");

        student2.study();
        student2.show();
    }
}
