package com.fengxiaoshuai.regularexpression;

public class RegularGroup {
    // 正则分组是有组号的,也就是序号。
    // 从1开始,连续不间断。
    // 以左括号为基准,最左边为第一组,其次为第二组,以此类推。

    // 捕获分组:后续还要继续使用本组的数据
    // 正则内部内部:\\组号
    // 正则外部使用:$ 组号
    // 非捕获分组:分组之后不需要再用本组数据,仅仅是把数据括起来
    // (?:正则) 获取所有
    // (?=正则) 获取前面部分
    // (?!正则) 获取不是指定内容的前面部分


    public static void main(String[] args) {
        // 判断一个字符串的开始字符和结束字符是否一致(只考虑一个字符)
        // \\表示组号,把该组内容拿出来再用一次
        String regex1 = "(.).+\\1";
        System.out.println("1234".matches(regex1));
        System.out.println("123a1".matches(regex1));

        // 判断一个字符串的开始字符和结束字符是否一致(可以有多个字符)
        String regex2 = "(.+).+\\1";
        System.out.println("abc12ab".matches(regex2));
        System.out.println("1234ab12".matches(regex2));

        // 判断一个字符串的开始字符和结束字符是否一致(开始部分内部内个字符也需一致)
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("abc12abc".matches(regex3));
        System.out.println("aab12baa".matches(regex3));


    }
}
