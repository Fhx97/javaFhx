package com.fengxiaoshuai.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderDemo1 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来，经历很多版本，目前企业中用的最多的是java8" +
                "和java11，因为这两个时候长期支持版本，下一个长期支持版本是java17，" +
                "相信在未来不久java17也会逐渐登上历史舞台。";
        Pattern p = Pattern.compile("java(8|11|17)");
        Pattern p1 = Pattern.compile("java(?!8|11|17)");
        Matcher m = p.matcher(str);
        Matcher m1 = p1.matcher(str);
        while (m.find()){
            String s = m.group();
            System.out.println(s.substring(0,4));
            System.out.println(s);
        }
        while (m1.find()){
            String s = m1.group();
            System.out.println(s);
        }
    }
}
