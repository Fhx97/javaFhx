package com.fengxiaoshuai.simpledatedemo;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str ="2000-11-11";
        Date d = sdf.parse(str);
        System.out.println(d);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String d1 = sdf1.format(d);
        System.out.println(d1);
    }
}
