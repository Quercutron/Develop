import java.util.Scanner;
public class ScannerDomeOne {
    //键盘录入
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("您的年龄是："+age);
        System.out.println("请输入您的出生年：");
        Scanner yScanner=new Scanner(System.in);
        int year=yScanner.nextInt();
        int count=year+age;
        System.out.println("今年是："+count);
    }
}
