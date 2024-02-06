package fhx.test;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        // default可省略,语法不会报错,但不建议省略,default不一定写在分支最下面,可以写在任意位置。
        // case穿透:语句中没有写break导致,程序会一直执行,直至遇到break或右大括号停止。一般用于case多个重复语句。
        // if多条件分支适用于对范围的判断;switch适用于把取值枚举出来。


//        System.out.println("你喜欢什么类型的女孩？");
//        Scanner sc = new Scanner(System.in);
//        String girl_type = sc.next();
//        switch (girl_type){
//            case "御姐":
//                System.out.println("怕你驾驭不住啊！！！");
//                break;
//            case "萝莉":
//                System.out.println("原来你是二次元啊！！！");
//                break;
//            case "邻家女孩":
//                System.out.println("这个绝对可以有！！！");
//                break;
//            case "高冷女神":
//                System.out.println("建议你再好好想想！！！");
//                break;
//            default:
//                System.out.println("你到底想干嘛？");
//                break;
//        }



//        // switch新特性
//        System.out.println("你喜欢什么类型的女孩？");
//        Scanner sc = new Scanner(System.in);
//        String girl_type = sc.next();
//        switch (girl_type) {
//            case "御姐" -> {
//                System.out.println("怕你驾驭不住啊！！！");
//            }
//            case "萝莉" -> {
//                System.out.println("原来你是二次元啊！！！");
//            }
//            case "邻家女孩" -> {
//                System.out.println("这个绝对可以有！！！");
//            }
//            case "高冷女神" -> {
//                System.out.println("建议你再好好想想！！！");
//            }
//            default -> {
//                System.out.println("你到底想干嘛？");
//            }
//        }



        System.out.println("请输入今天星期几？");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {

            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.print("休息日");
            default -> System.out.println("请输入1-7之间的数字！！！");

//            // 利用switch穿透解决输出重复问题
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("工作日");
//                break;
//            case 6:
//            case 7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("请输入1-7之间的数字！！！");


//            case 1 -> System.out.println("工作日");
//            case 2 -> System.out.println("工作日");
//            case 3 -> System.out.println("工作日");
//            case 4 -> System.out.println("工作日");
//            case 5 -> System.out.println("工作日");
//            case 6 -> System.out.println("休息日");
//            case 7 -> System.out.println("休息日");
//            default -> System.out.println("请输入1-7之间的数字！！！");
        }

    }
}
