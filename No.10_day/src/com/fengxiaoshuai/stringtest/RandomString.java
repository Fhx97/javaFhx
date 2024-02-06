package com.fengxiaoshuai.stringtest;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        // 输入一个字符串,打乱输出
        String str = "abcdefg";
        char[] str_array = str.toCharArray();
        Random r = new Random();
        char[] new_array = new char[str_array.length];
        int count = 0;
        for (int i = 0; i < new_array.length; i++) {
            while(true){
                int index = r.nextInt(str_array.length);
                if(checkArray(str_array[index],new_array)){
                    new_array[i] = str_array[index];
                    count++;
                    break;
                }
            }

        }
        String out_str = new String(new_array);
        System.out.println(out_str);

    }
    public static boolean checkArray(char str,char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(str==arr[i]){
                return false;
            }
        }
        return true;
    }
}
