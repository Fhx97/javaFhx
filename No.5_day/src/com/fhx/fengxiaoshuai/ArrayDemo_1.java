package com.fhx.fengxiaoshuai;

public class ArrayDemo_1 {
    public static void main(String[] args) {
        // 数组是一种容器,可以用来存储同种数据类型的多个值。
        // 数组定义及静态初始化
        int array_1[] = new int[]{1,2,3,4};
        int[] array_2 = new int[]{5,6,7,8};
        int[] array_3 = {11,12,13,14};
        // 打印数组的地址值
        System.out.println(array_1);
        System.out.println(array_2);
        System.out.println(array_3);
        // 通过索引访问数组元素,从0开始。
        System.out.println(array_1[1]);
        System.out.println(array_2[2]);
        System.out.println(array_3[3]);
        // 数组元素重新赋值
        array_1[1] = 0;
        System.out.println(array_1[1]);
        // 数组遍历
        for(int i = 0; i<array_1.length ; i++){
            System.out.println(array_1[i]);
        }

        // 将数组里的元素求和
        int sum = 0 ;
        for (int i = 0; i < array_2.length; i++) {
            sum += array_2[i];
        }
        System.out.println(sum);

        // 数组动态初始化,手动制定数组长度。
        int[] array_4 = new int[4];
        for (int i = 0; i < array_4.length; i++) {
            array_4[i] = i;
        }
        System.out.println(array_4[3]);

    }
}
