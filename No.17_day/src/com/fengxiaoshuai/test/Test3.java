package com.fengxiaoshuai.test;

public class Test3 {
    // 猴子吃桃问题
    // 每天吃当前数量的一半+1
    // 吃了9天,到第10天发现只剩一个桃子,问最初还有多少个桃子
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (arr[i-1]+1)*2;
        }
        System.out.println(arr[9]);
        System.out.println(getPeach(10));

    }
    private static int getPeach(int day){
        if(day == 1){
            return  1 ;
        }else{
            return (getPeach(day-1)+1)*2;
        }
    }

}
