package com.fengxiaoshuai.testdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String birthDate = "1999-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse(birthDate);
        System.out.println(birth);
        Date current = new Date();
        System.out.println(current);
        long time = current.getTime() - birth.getTime();
        System.out.println(time/(1000*60*60*24));


    }
}
