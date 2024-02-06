package com.fhx.fengxiaoshuai;

import java.util.Random;

public class ArrayDemo_2 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        // 求最值
        int[] arr_1 = new int[]{33,5,22,44,55};
        int arr_max = arr_1[0];
        for (int i = 1; i < arr_1.length; i++) {
            arr_max = arr_max > arr_1[i]? arr_max:arr_1[i];
        }
        System.out.println(arr_max);
        System.out.println("-------------------------");
        // 生产10个1-100之间的随机数存入数组,求和、求平均及求多少个数比平均值小。
        Random r = new Random();
        int[] arr_r =new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr_r.length; i++) {
            arr_r[i] = r.nextInt(100) +1;
            sum += arr_r[i];
        }
        double avg = (double)sum / arr_r.length;
        for (int i = 0; i < arr_r.length; i++) {
            if(arr_r[i] < avg){
                count+= 1;
            }
        }
        System.out.println("和为:"+sum);
        System.out.println("平均数为:"+avg);
        System.out.println("有"+count+"个数比平均值小");
        System.out.println("-------------------------");

        // 交换数据
        int[] arr_2 = new int[]{1,2,3,4,5};
        int[] arr_3 = new int[arr_2.length];
        for (int i = 0; i < arr_2.length; i++) {
            arr_3[arr_3.length-i-1] = arr_2[i];
        }
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr_3.length; i++) {
            System.out.print(arr_3[i]+" ");
        }
        System.out.print("\n");
        int[] arr_4 = new int[arr_2.length];
        for (int i = 0; i < arr_4.length; i++) {
            arr_4[i] = arr_2[i];
        }
        arr_4[0] = arr_3[0];
        arr_4[arr_4.length-1]=arr_3[arr_4.length-1];
        for (int i = 0; i < arr_4.length; i++) {
            System.out.print(arr_4[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i]+" ");
        }
        System.out.print("\n");
        System.out.println("-------------------------");

        // 数据打乱
        int[] arr_5 = {1,2,3,4,5};
        for (int i = 0; i < arr_5.length; i++) {
            System.out.print(arr_5[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr_5.length; i++) {
            int r_index = r.nextInt(arr_5.length);
            int t = arr_5[i];
            arr_5[i] = arr_5[r_index];
            arr_5[r_index] = t;
        }
        for (int i = 0; i < arr_5.length; i++) {
            System.out.print(arr_5[i]+" ");
        }
        System.out.print("\n");

        System.out.println("-------------------------");


    }
}
