package com.fengxiaoshuai.stringtest;

public class StringJoint {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str_new = stringJoint(arr);
        System.out.println(str_new);
    }
    public static String stringJoint(int[] arr){
        if(arr == null){
            return "";
        }

        if(arr.length == 0){
            return "[]";
        }
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str+=arr[i];
        }
        return str;
    }
}
