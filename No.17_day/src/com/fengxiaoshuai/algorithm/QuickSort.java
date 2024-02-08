package com.fengxiaoshuai.algorithm;

import javax.swing.*;

public class QuickSort {
    // 快速排序
    // 第一轮:把0索引作为基准数,确定基准数在数组中正确的位置。
    // 比基准数小的全部在左边,比基准数大的全部在右边。
    // 以此类推。
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    private static void quickSort(int[] arr,int i,int j){
        // 定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if(start>end){
            // 递归出口
            return;
        }
        // 记录基准数
        int baseNumber = arr[i];

        // 利用循环找到要交换的数字
        while (start!=end){
            // 利用end,从后往前找,找比基准数小的数字
            while(true){
                if(start >= end || arr[end] < baseNumber){
                    break;
                }
                end--;
            }

            // 利用start,从前往后找,找比基准数大的数字
            while (true){
                if(start >= end || arr[start] > baseNumber){
                    break;
                }
                start++;
            }
            // 把end和start指向的元素交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            }


        // 当start和end指向了同一个元素的时候,上述循环就将结束.
        // 表示已经找到了基准数在数组中存入的位置
        // 基准数归位
        // 拿这个范围的第一个数字跟start指向的元素进行互换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        // 确定6左边的范围，重复
        quickSort(arr,i,start-1);
        // 确定6右边的范围，重复
        quickSort(arr,start+1,j);

    }
}
