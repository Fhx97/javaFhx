package com.fengxiaoshuai.test;

import com.fengxiaoshuai.domain.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class CodeTest {


    public static void main(String[] args) {
        char[] letter = new char[52];
        for (int i = 0; i < 26; i++) {
            letter[i] =(char)('a' +i);
        }
        for (int i = 26; i < 52; i++) {
            letter[i] =(char)('A' +i-26);
        }
        Random r = new Random();
        char[] codeArr = new char[5];
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            codeArr[i] = letter[index];
        }
        int number = r.nextInt(10);
        codeArr[4] = (char)(number+48);
        for (int i = 0; i < codeArr.length; i++) {
            int r_index = r.nextInt(5);
            char temp = codeArr[i];
            codeArr[i] = codeArr[r_index];
            codeArr[r_index] = temp;
        }
        String finalCode = new String(codeArr);
        System.out.println(finalCode);






    }
}
