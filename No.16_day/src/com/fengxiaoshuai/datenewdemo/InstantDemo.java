package com.fengxiaoshuai.datenewdemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        // 获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);
        // 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);
        // 指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);


    }
}
