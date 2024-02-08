package com.fengxiaoshuai.algorithm;

import java.util.PrimitiveIterator;

public class InsertSort {
    // 插入排序
    // 将0索引的元素到N索引的元素看做是有序的,把N+1索引的元素到最后一个
    // 遍历无序的数据,将遍历到的元素插入到有序序列中的适当位置,如遇到相同数据,插在后面
    // N的范围:0-最大索引
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        // 找到无序的数据从哪个索引开始
        int startIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
