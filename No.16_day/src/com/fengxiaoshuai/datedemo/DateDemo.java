package com.fengxiaoshuai.datedemo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 打印时间原点开始一年之后的时间
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time+1000L*60*60*24*365;
        d1.setTime(time);
        System.out.println(d1);

        //
    }
}
