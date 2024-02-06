package com.fengxiaoshuai.newstudentsystem;

import java.util.Locale;
import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char)(48+i);
        }
        char[] letter_arr = new char[52];
        for (int i = 0; i < 26; i++) {
            letter_arr[i] = (char)('a'+i);
        }
        for (int i = 26; i < 52; i++) {
            letter_arr[i] = (char)('A'+i-26);
        }
        char[] verify_num = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int letter_index = r.nextInt(52);
            verify_num[i] = letter_arr[letter_index];
        }
        int num_index = r.nextInt(10);
        verify_num[4]= num_arr[num_index];
        int random_index = r.nextInt(5);
        char temp = verify_num[4];
        char t_temp = verify_num[random_index];
        verify_num[random_index] = temp;
        verify_num[4] = t_temp;
        String verify = new String(verify_num);
        System.out.println(verify);



    }
}
