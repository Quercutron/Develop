# Develop
java黑马程序员的练习库
JDK官网	http://www.oracle.com（javac把.java文件编译为.class文件，java运行文件）
配置环境变量（bin）
class（定义一个类）
字面量类型（整数，小数，字符串，字符，布尔型，空类型）
制表符'\t'把字符串补齐8位
数据类型 变量名=数据值；(变量请直接赋值)
二进制（0b）八进制（0）十进制（null）十六进制（0x）
任意进制转十进制（公式：系数*基数的权次幂 相加）
byte的取值范围（-128~127）
标识符：类，方法，变量的名称；不能以数字开头；由字母，数字，-,$组成；
键盘录入：Scanner (ScannerDomeOne)
(
import java.until.Scanner;
Scanner sc=new Scanner(System.in);
int name=sc.nextIn();
)
IDEA(下载官网：https://www.jetbrains.com/idea/)
IDEA四层结构（project 项目；module 模块；package 包；class 类；）
小数参与运算可能丢失精度
算术运算符：=，-，乘，/，%；
小自动升大，大强制缩小。
byte，short，char升为int；
强制转换类型：目标数据类型 变量名=（目标数据类型）被强制转换变量名；
例：int a=（int）b；（可能精度丢失）
字符串只有拼接操作；
自增自减：先用后加（b=a++），先加后用(b=++a);
加等减等：加后赋值（a+=b），赋值后加（a=+b）；
&与|或！非，^异或；
&&短路与（都真才真），||短路或（有真则真）；
Test7：两个输入数与6比较。
Test8：比较两只老虎的体重是否相同。
