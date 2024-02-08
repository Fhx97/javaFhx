package com.fengxiaoshuai.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        String[] arr = {"a","aa","aaa","aaaa"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()- o2.length();
//            }
//        });

        Arrays.sort(arr, (o1,o2) -> o1.length()- o2.length());

        System.out.println(Arrays.toString(arr));
    }

}
