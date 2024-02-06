package com.fengxiaoshuai.setdemo;

public class TestDemo {
    public static void main(String[] args) {
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char) (48 + i);
            System.out.print(num_arr[i] + " ");
        }
    }

}
