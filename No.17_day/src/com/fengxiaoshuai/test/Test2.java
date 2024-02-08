package com.fengxiaoshuai.test;

public class Test2 {
    public static void main(String[] args) {
        //斐波那契数列(不死神兔)
        // 第一个月 1对1
        // 第二个月 1对1
        // 第三个月 1+1对2
        // 第四个月 1+1+1对 3
        // 第五个月 1+1+1+1+1 5
        // 第六个月 1+1+1+1+1+1 8  13 21 34 55 89 144
        int number = getRabbit(12);
        System.out.println(number);


    }

    private static int getRabbit(int month){
        int[] arr = new int[month];
        if(month < 3){
           return 1;
        }else{
           arr[0] = 1;
           arr[1] = 1;
           for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
           return arr[month-1];
       }
    }
}
