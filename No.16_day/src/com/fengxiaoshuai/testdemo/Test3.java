package com.fengxiaoshuai.testdemo;

public class Test3 {
    // 将一个十进制的正式装换成字符串的二进制表现形式
    public static void main(String[] args) {
        int number = 125;
        String str = "";
        while (number != 0){
            str = str + number%2;
            number = number / 2 ;

        }

        char[] strArr = str.toCharArray();
        int count = strArr.length;
        char[] numArr = new char[count];
        for (int i = 0; i < count; i++) {
            numArr[count-i-1] = strArr[i];
        }
        String result = new String(numArr);
        System.out.println(str);
        System.out.println(result);
    }
}
