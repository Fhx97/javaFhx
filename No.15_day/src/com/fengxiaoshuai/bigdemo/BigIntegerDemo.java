package com.fengxiaoshuai.bigdemo;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Random;

public class BigIntegerDemo {
    // 在Java中整数有四种类型:byte(1个字节)、short(2个字节)、int(4个字节)、long(8个字节)。
    // BigInteger对象一旦创建,内部记录的值不能发生改变。
    public static void main(String[] args) {
        // 获取一个随机的大整数,范围:[0,2的num次方-1]
        Random r = new Random();
        BigInteger big1 = new BigInteger(4,r);
        System.out.println(big1);

        // 获取指定的大整数,字符串中的数字必须是整数
        BigInteger big2 = new BigInteger("100000000000000000001");
        System.out.println(big2);

        BigInteger big3 = new BigInteger("22");
        BigInteger big4 = big2.add(big3);
        System.out.println(big4);

        // BigInteger底层存储方式
        //


    }




}
