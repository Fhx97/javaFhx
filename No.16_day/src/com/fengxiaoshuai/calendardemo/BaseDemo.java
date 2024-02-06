package com.fengxiaoshuai.calendardemo;

import java.util.Calendar;

public class BaseDemo {
    // Calendar代表了系统当前时间的日历对象,可以单独修改、获取时间中的年、月、日
    // Calendar是一个抽象类,不能直接创建对象
    public static void main(String[] args) {
        // 会根据系统地不同时区来获取不同的日历对象
        // 会把时间中的纪元、年、月、日、时、分、秒、星期等都放到一个数组当中
        // 月份:范围0-11(如果获取出来的是0,那么实际上是1月)
        // 星期:1(星期日)-7(星期六)
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        // java在Calendar类中,把索引对应的数字都定义成常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+","+month+","+date+","+week);


    }

}
