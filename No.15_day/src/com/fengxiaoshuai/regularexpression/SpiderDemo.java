package com.fengxiaoshuai.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderDemo {
    public static void main(String[] args) {
        String str = "java自从95年问世以来，经历很多版本，目前企业中用的最多的是java8" +
                     "和java11，因为这两个时候长期支持版本，下一个长期支持版本是java17，" +
                     "相信在未来不久java17也会逐渐登上历史舞台。";
        // Pattern:表示正则表达式。
        // Matcher:文本匹配器,作用按照正则表达式的规则去读取字符串,从头开始读取。
        //         在大串中去找符合匹配规则的字串。

        // 获取正则表达式对象
        Pattern p = Pattern.compile("java\\d{0,2}");
        // 获取文本匹配的对象
        Matcher m = p.matcher(str);
        // 根据文本匹配器结果,返回true或false,在底层记录子串的起始索引和结束索引+1
        boolean b = m.find();

        // 方法底层会根据find方法就得索引进行字符串的截取
        // substring(起始索引,结束索引)
        // 会把截取的小串进行返回
        String s = m.group();
        System.out.println(s);

        // 第二次调用find方法时,会继续读取后面的内容
        // 读取到第二个满足要求的子串,方法会继续返回true
        // 并把第二个字串的起始索引和结束索引+1进行记录
        b = m.find();
        String s1 = m.group();
        System.out.println(s1);



    }
}
