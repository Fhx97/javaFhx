package com.fengxiaoshuai.bigdemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class BigDecimalDemo {
    // 用于小数的精确运算
    public static void main(String[] args) {
            BigDecimal bd1 = new BigDecimal(0.01);
            System.out.println(bd1);

            BigDecimal bd2 = new BigDecimal("0.01");
            System.out.println(bd2);



    }


}
