package com.fengxiaoshuai.staticdemo2;

public class ArrayUtil {
    // 私有化构造方法:为了不让外界创建它的对象
    private ArrayUtil(){}
    // 将整数数组内容以字符串形式输出
    public static String printArr(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str = str + arr[i]+"]";
            }else{
                str = str + arr[i]+",";
            }

        }
        return str;
    }

    // 求整数数组的平均值
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avgNum = sum / arr.length;
        return avgNum;
    }
}
