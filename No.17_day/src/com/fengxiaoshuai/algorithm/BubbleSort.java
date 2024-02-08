package com.fengxiaoshuai.algorithm;

public class BubbleSort {
    // 冒泡排序
    // 相邻的数据两两比较,小的放前面,大的放后面
    // 第一轮循环结束,最大值已经找到,在数组的最右边
    // 第二轮循环只要在剩余的元素找最大值就可以了
    // 每二轮结束，次最大值已经确定,第三轮循环继续在剩余数据组循环
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int count = arr.length-1;
        for (int i = 0; i < count; i++) {
            arr = arrSort(arr);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static int[] arrSort(int[] arr){
        int count = arr.length;
        int temp = arr[0];
        for (int i = 1; i < count; i++) {
            if(temp>=arr[i]){
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            temp = arr[i];
        }
        return arr;

    }
}
