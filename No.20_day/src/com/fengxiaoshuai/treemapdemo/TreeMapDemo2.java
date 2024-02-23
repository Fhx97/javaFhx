package com.fengxiaoshuai.treemapdemo;

import java.security.Key;
import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        char[] strArray = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
//        TreeMap<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;

        for (int i = 0; i < strArray.length; i++) {
            switch (strArray[i]){
                case 'a':
                    aCount++;
                    map.put('a',aCount);
                    break;
                case 'e':
                    eCount++;
                    map.put('e',eCount);
                    break;
                case 'c':
                    cCount++;
                    map.put('c',cCount);
                    break;
                case 'd':
                    dCount++;
                    map.put('d',dCount);
                    break;
                case 'b':
                    bCount++;
                    map.put('b',bCount);
                    break;

            }
        }
        Set<Character> setKeys = map.keySet();
        Iterator<Character> it = setKeys.iterator();
        while (it.hasNext()){
            char key = it.next();
            System.out.print(key+"("+map.get(key)+"）");
        }
    }
}
