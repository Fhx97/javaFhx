package com.fengxiaoshuai.testdemo;

import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        // 判断是否为闰年
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
