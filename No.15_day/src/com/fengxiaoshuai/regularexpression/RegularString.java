package com.fengxiaoshuai.regularexpression;

public class RegularString {
    public static void main(String[] args) {
        String str = "丰小帅asdgqwerasdff丰大帅qwefas丰中帅";
        String str1 = str.replaceAll("[a-z]+","vs");
        System.out.println(str1);

        String[] strArr = str.split("[a-z]+");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
