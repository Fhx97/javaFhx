package com.fengxiaoshuai.stringtest;

public class StringJointTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringBuilder str = new StringBuilder("[");
        String new_str = str.append(arr[0]).append(",").append(arr[1]).append(",").append(arr[2]).append("]").toString();
        System.out.println(new_str);
    }
}
