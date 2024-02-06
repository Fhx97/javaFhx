package com.fengxiaoshuai;

import java.util.Random;

public class RedWars {
    public static void main(String[] args) {
        int[] money_arr = {2,588,888,1000,10000};
        int[] arr_1 = getNextArray(money_arr);
        int[] arr_2 = getNextArray(arr_1);
        int[] arr_3 = getNextArray(arr_2);
        int[] arr_4 = getNextArray(arr_3);
        int[] arr_5 = getNextArray(arr_4);



    }
    public static int[] getNextArray(int[] arr){
        Random r = new Random();
        int r_index = r.nextInt(arr.length);
        System.out.println(arr[r_index]+"奖金已被抽出！");
        int[] new_arr = new int[arr.length-1];
        int index_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[r_index]){
                new_arr[index_1] = arr[i];
                index_1++;
            }

        }
        return new_arr;

    }
}
