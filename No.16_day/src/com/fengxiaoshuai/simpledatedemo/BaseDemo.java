package com.fengxiaoshuai.simpledatedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseDemo {
    // SimpleDateFormat
    // 格式化:把时间变成我们喜欢的格式
    // 把字符串表示的时间变成Date对象
    // yyyy-MM-dd HH:mm:ss
    // yyyy年MM月dd日 HH:mm:ss
    public static void main(String[] args) {
        // 默认
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);

        // 指定
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = new Date(0L);
        String str1 = sdf2.format(d1);
        System.out.println(str1);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE");
        Date d2 = new Date(0L);
        String str2 = sdf3.format(d2);
        System.out.println(str2);

    }
}
