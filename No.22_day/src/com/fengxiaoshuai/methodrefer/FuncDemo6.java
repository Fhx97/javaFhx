package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class FuncDemo6 {
    /*引用数组的构造方法
      数据类型[]::new
      int[]::new
      数组的类型需跟流中的类型一致
    * */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
