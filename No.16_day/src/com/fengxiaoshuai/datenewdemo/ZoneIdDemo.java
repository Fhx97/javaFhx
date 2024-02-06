package com.fengxiaoshuai.datenewdemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        // 获取所有的时区
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        // 获取当前系统地默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        // 获取指定时区
        ZoneId zoneId1= ZoneId.of("America/Cuiaba");
        System.out.println(zoneId1);

    }
}
