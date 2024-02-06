package com.fengxiaoshuai.staticdemo2;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {1,28,11,6,9};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr_2 = {1.0,13.2,29.3,30};
        double num = ArrayUtil.getAverage(arr_2);
        System.out.println(num);
        double sum = 0;
        for (int i = 0; i < arr_2.length; i++) {
            sum +=arr_2[i];
        }
        System.out.println(sum/ arr_2.length);
    }
}
