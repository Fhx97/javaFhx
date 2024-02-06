package com.fengxiaoshuai;

import java.util.Random;

public class DelVer {
    public static void main(String[] args) {
        Random r = new Random();
        // 0-9随机数产生
        int r_num = r.nextInt(10);
        // 26个大写字母和26个小写字母装进一个数组
        char[] letters = new char[52];
        // 将大写字母装机数组
        for(int i = 0;i<26;i++){
            letters[i] = (char)('A'+i);
        }
        for(int i = 0;i<26;i++){
            letters[i+26] = (char)('a'+i);
        }
        String ver_num ="";
        for(int i=1;i<5;i++ ){
            int r_index = r.nextInt(52);
            ver_num += letters[r_index];
        }
        System.out.println(ver_num+r_num);


    }
}
