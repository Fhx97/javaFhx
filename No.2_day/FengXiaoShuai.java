// 整数:byte(-128~127)/short(-32768~32767)/int(10位数)默认/long(19位数)
// 浮点数:float/double默认
// 字符:char
// 布尔:boolean
// 整数和小数取值范围大小关系:double > float > long > int > short > byte 
// 定义long类型变量:需要加入L标识(大小写都可以)
// float类型变量:需要加入F标识(大小写都可以)


// 标识符:就是给类、方法、变量等起的名字(业内一般以阿里命名规范为标准)
// 由数字、字母、下划线(_)和美元符($)组成
// 不能以数字开头
// 不能是关键字
// 区分大小写
// ---------------------------
// 小驼峰命名法(方法、变量)
// 规范1:标识符是一个单词的时候,全部小写,例如name
// 规范2:标识符由多个单词组成的时候,第一个单词的首字母小写,其他单词首字母大写,例如firstName
// ---------------------------
// 大驼峰命名法(类名)
// 规范1:标识符是一个单词的时候,首字母大写,例如Student
// 规范2:标识符由多个单词组成的时候,每个单词的首字母大写,例如GoodBoy
// ---------------------------

// 键盘录入(Scanner):可以接收键盘输入的数字
// 导包(Scanner这个类在哪)====>创建对象(开始使用Scanner类)====>接收数据(开始干活)
// import java.util.Scanner;导包的动作必须出现在类定义的上边
// Scanner sc = new Scanner(System.in); 只有变量名sc可以变,其他都不允许变
// int i = sc.nextInt();变量名i可以变,其他都不允许表




// 输出丰小帅的基本信息
public class FengXiaoShuai{
	// 主入口
	public static void main(String[] args){
		String name = "丰小帅";
		int age = 18;
		char sex = '男';
		double height = 178.8;
		char status = '是';
		System.out.println("姓名:" + name);
		System.out.println("年龄:" + age);
		System.out.println("性别:" + sex);
		System.out.println("身高:" + height);
		System.out.println("是否单身:" + status);
	}
}

