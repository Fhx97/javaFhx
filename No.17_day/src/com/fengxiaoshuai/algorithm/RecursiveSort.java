package com.fengxiaoshuai.algorithm;

public class RecursiveSort {
    // 递归算法
    // 递归指的是方法中调用方法本身的现象
    // 递归一定要有出口,否则就会出现内存溢出
    // 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
    public static void main(String[] args) {
        int result = getSum(100);
        System.out.println(result);
        int result1 = getFactorial(5);
        System.out.println(result1);
    }

    // 求1-100之间的和
    private static int getSum(int number){
        if(number == 1){
            return 1;
        }else{
            return number + getSum(number-1);
        }

    }

    // 求阶乘
    private static int getFactorial(int number){
        if(number == 1){
            return 1;
        }else{
            return number * getFactorial(number-1);
        }
    }
}
