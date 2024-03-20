package com.fengxiaoshuai.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 编码(默认utf-8)
        String str = "i老虎油";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        // 指定编码方式(例如GBK)
        byte[] gbks = str.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        // 解码
        String str2 = new String(bytes1);
        System.out.println(str2);
        String str3 = new String(bytes1,"gbk");
        System.out.println(str3);

    }
}
