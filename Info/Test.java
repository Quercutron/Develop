package com.itheima.Info;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Test {
    public static void main(String[] args) {
//        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//        学生的属性：学号，姓名，年龄。
//        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//        要求2：添加完毕之后，遍历所有学生信息。
//        要求3：通过id删除学生信息
//               如果存在，则删除，如果不存在，则提示删除失败。
//        要求4：删除完毕之后，遍历所有学生信息。
//        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁

        //创建一个长度为3的数组
        Student[] students=new Student[3];
        //创建1~3名学生对象
        Student stu1=new Student(001,"小明",18);
        Student stu2=new Student(002,"小红",19);
        Student stu3=new Student(003,"小黄",20);
        //将对象添加到数组中
        students[0]=stu1;
        students[1]=stu2;
        students[2]=stu3;

//        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//      1.再添加一个学生对象
        Student stu4=new Student(004,"小黑",21);
//      2.添加时进行学号的唯一性判断
//      存在--不添加 不存在--添加
//      不存在--数组已满，数组扩容（另加一老数组长度+1的新数组）数组未满，直接添加。
        boolean flag=countine(stu4.getId(),students);
        if (flag){
            //存在，不添加
            System.out.println("学号存在");
        }else {
            //不存在--添加
            //判断数组是否存满
            int count=getCount(students);
            if (count==students.length){
                //数组已满，数组扩容
                System.out.println("数组已满！创建的新数组如下：");
                //进行扩容
                Student[] newArr=creatArr(students,count);
                //在新数组中添加新对象，newArr为新数组
                newArr[count]=stu4;
                //打印信息
                getArrInfo(newArr);
            }else {
                students[count]=stu4;
                getArrInfo(students);
            }
        }
//        要求2：添加完毕之后，遍历所有学生信息。
//        要求3：通过id删除学生信息
//               如果存在，则删除，如果不存在，则提示删除失败。
//         存在--删除（根据下标删除），不存在--提示失败
        int index=getIndex(students,002);
        if (index>0){
            //存在--删除
            students[index]=null;
        }else {
            //不存在--提示失败
            System.out.println("删除失败");
        }
//        要求4：删除完毕之后，遍历所有学生信息。
//          空--提示为空，不为空则打印信息。
        boolean flags=getArrNull(students);
        if (flags){
            //不为空
            getArrInfo(students);
        }else {
            //空
            System.out.println("数组为空");
        }
        //        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        //
        int indexs=getIndex(students,001);
        if (indexs>0){
            //存在--删除
            students[index].setAge(students[indexs].getAge()+1);
            System.out.println(students[index].getAge());
        }else {
            //不存在--提示失败
            System.out.println("该学生不存在");
        }
    }



    //定义一个方法判断数组是否为空。
    public static boolean getArrNull(Student[] arr){
        boolean flags=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr!=null){
                flags=true;
            }
        }
        return flags;
    }
    //定义一个方法根据id查找该学生下标。
    public static int getIndex(Student[] arr,int index){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if (stu!=null){
                int sid=stu.getId();
                if (index== sid){
                    return i;
                }
            }
        }
        return -1;
    }
    //定义一个方法进行遍历信息
    public static void getArrInfo(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if (stu!=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }
        }
    }
    //进行扩容，将老数组复制到新数组中
    public static Student[] creatArr(Student[] students,int count){
        Student[] newArr=new Student[count+1];
        for (int i = 0; i < students.length; i++) {
            newArr[i]=students[i];
        }
        return newArr;
    }
    //判断数组中有几个元素
    public static int getCount(Student[] students){
        int count=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null)
                count++;
        }
        return count;
    }
    //判断是否存在唯一性
    //1.我要干嘛？判断学号的唯一性
    //2.我需要什么？学号
    //3.要不要返回什么？是否存在
    public static boolean countine(int id,Student[] student){
        boolean flag=false;
        for (int i = 0; i < student.length; i++) {
            Student stu=student[i];
            //判空，如果数组内有空，那么就会复制出错
            if (stu != null){
                if (id==student[i].getId()){
                    flag=true;
                }
            }

        }
        return flag;
    }
}
