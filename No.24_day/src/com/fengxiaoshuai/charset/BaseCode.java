package com.fengxiaoshuai.charset;

public class BaseCode {
    // 在计算机中,任意数据都是以二进制的形式来存储的
    // 计算机中最小的存储单元是一个字节
    // ASCII字符集中,一个英文占一个字节
    // 简体中文版Windows,默认使用GBK字符集
    // GBK字符集完全兼容ASCII字符集(一个英文占一个字节,二进制第一位是0;一个中文占两个字节,二进制高位字节的第一位是1)

    // utf-8(不是字符集,是Unicode的一种编码方式): ASCII(一个字节) 简体中文(3个字节)
    // 一个英文占一个字节,二进制的第一位是0,转成十进制是正数
    // 一个中文占三个字节,二进制第一位是1,第一个字节转成十进制是负数

    // 为什么会出现乱码？
    // 读取数据时未读完整个汉字
    // 编码和解码时的方式不统一
    // 防止出现乱码:不要用字节流读取文本文件,编码解码使用同一个码表,同一个编码方式




}
