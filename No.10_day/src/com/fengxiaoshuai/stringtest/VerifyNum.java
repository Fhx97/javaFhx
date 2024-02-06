package com.fengxiaoshuai.stringtest;

import java.util.Random;

public class VerifyNum {
    public static void main(String[] args) {
        char[] lower_array = new char[26];
        for (int i = 0; i < lower_array.length; i++) {
            lower_array[i] = (char)('a'+i);
        }
        char[] upper_array = new char[26];
        for (int i = 0; i < upper_array.length; i++) {
            upper_array[i] = (char)('A'+i);
        }
        char[] num_array = new char[10];
        for (int i = 0; i < num_array.length; i++) {
            num_array[i]=(char)('0'+i);
        }
        String new_char = String.valueOf(upper_array) + String.valueOf(lower_array);
        char[] out_array = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            out_array[i] = new_char.charAt(index);
        }
        int num_index = r.nextInt(10);
        out_array[4] = num_array[num_index];
        char[] random_array = new char[5];
        for (int i = 0; i < random_array.length; i++) {
            while(true){
                int random_index = r.nextInt(5);
                if(checkArray(out_array[random_index],random_array)){
                    random_array[i] = out_array[random_index];
                    break;
                }
            }
        }

        String result = new String(random_array);
        System.out.println(result);
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
