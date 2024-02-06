package com.fengxiaoshuai.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderDemo2 {
    public static void main(String[] args) {
        // 贪婪爬取:在爬取数据的时候尽可能的多获取数据(默认)
        // 非贪婪爬取:在爬取数据的时候尽可能的少获取数据
        String str = "java自从95年问世以来，abbbbbbbbbbaaaaaaaaaaaaaaaaa" +
                "经历很多版本，目前企业中用的最多的是java8" +
                "和java11，因为这两个时候长期支持版本，下一个长期支持版本是java17，" +
                "相信在未来不久java17也会逐渐登上历史舞台。";
        // 贪婪爬取
        Pattern p = Pattern.compile("ab+");
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }
        // 非贪婪爬取
        Pattern p1 = Pattern.compile("ab+?");
        Matcher m1 = p1.matcher(str);
        while (m1.find()){
            System.out.println(m1.group());
        }
    }
}
