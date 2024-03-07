package com.fengxiaoshuai.methodrefer;


import java.util.Arrays;
import java.util.Comparator;

public class FuncDemo1 {
    /*方法引用时需注意
    需要有函数式接口
    被引用方法必须已经存在
    被引用方法的形参和返回值需跟抽象方法保持一致
    被引用方法的功能需满足当前的需求
    * */

    public static void main(String[] args) {
        // 创建一个数组,进行倒序排序
        Integer[] arr = {3,5,4,1,6,2};
        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        // lambda表达式简化格式
//        Arrays.sort(arr,(o1,o2)->o2-o1);
        // 方法引用
        Arrays.sort(arr,FuncDemo1::backOrder);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    // 可以是java已经写好的,也可以是一些第三方工具类
    public static int backOrder(int n1 ,int n2){
        return n2 - n1;
    }
}
