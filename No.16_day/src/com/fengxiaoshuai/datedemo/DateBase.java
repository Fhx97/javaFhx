package com.fengxiaoshuai.datedemo;

import java.util.Date;

public class DateBase {
    // 全世界时间统一计算标准
    // 格林尼治时间/格林威治时间(Greenwich Mean Time)简称GMT
    // 计算核心:地球自转一天是24小时,太阳直射时为正午12点

    // 原子钟:利用铯原子的震动频率计算出来的时间,作为标准时间(UTC)。
    // 震动9192631770此约等于1

    // 中国标准时间:时间标准时间+8小时

    // Date类是一个JDK写好的JavaBean类,用来描述时间,精确到毫秒。
    // 利用空参构造创建的对象,默认表示系统当前时间。
    // 利用有参构造创建对象,表示指定时间。

    public static void main(String[] args) {
        // 获取当前时间
        Date d1 = new Date();
        System.out.println(d1);

        // 指定时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        // 修改时间
        d2.setTime(1000000L);
        System.out.println(d2);

        // 获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);
    }






}
