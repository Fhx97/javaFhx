package com.fengxiaoshuai.logindemo1;

import cn.hutool.core.io.file.FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class UserInfoImport {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("../../../output/names.txt");
        String result = fr.readString();
        String[] arr = result.split("\r\n");
        ArrayList<String> students = new ArrayList<>();
        for (String s : arr) {
            students.add(s.substring(0,3));
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("../No.26_day/output/user.txt"));
        for (int i = 0; i < 50; i++) {
            bw.write((new User(students.get(i),getPassword())).toString());
            bw.newLine();
        }
        bw.close();




    }
    public static String getPassword(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> pw= new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            pw.add((char)('a' + i));
            pw.add((char)('A' + i));
        }
        for (int i = 0; i < 10; i++) {
            pw.add((char)('0'+i));
        }
        Collections.shuffle(pw);
        String pwFinal = "";
        for (int i = 0; i < 6; i++) {
            pwFinal += pw.get(i);
        }
        return pwFinal;



    }
}
