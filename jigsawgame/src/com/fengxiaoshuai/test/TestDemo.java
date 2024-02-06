package com.fengxiaoshuai.test;

import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        int[] tempArr = new int[16];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = i;
        }
        int[][] arr = new int[4][4];
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(16);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        int x = 0;
        int y = 0;

        int tempIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(tempArr[tempIndex]==0){
                    x = i;
                    y = j;
                }
                arr[i][j] = tempArr[tempIndex];
                tempIndex++;
            }
        }
        System.out.println(x+" "+y);


    }
}
