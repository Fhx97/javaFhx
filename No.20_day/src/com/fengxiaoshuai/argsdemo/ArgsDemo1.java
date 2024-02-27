package com.fengxiaoshuai.argsdemo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        // 从JDK5以后,有可变参数(其底层就是个数组)
        // 在方法的形参中最多只能写一个可变参数
        // 如结合其他类型形参,可变参数需放在形参列表最后
        int sum = getSum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum);

    }
    public static int getSum(int...args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
    }

}
