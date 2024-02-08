package com.fengxiaoshuai.algorithm;

public class ChooseSort {
    // 选择排序
    // 从0开始,拿着每一个索引上的元素跟后面的元素依次比较
    // 小的放前面,大的放后面,依次类推。
    // 第二轮循环从1开始
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int[] newArr = arrSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
    private static int[] arrSort(int[] arr){
        int count = arr.length;
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i]>=arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
