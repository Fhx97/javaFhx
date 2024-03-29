package com.fengxiaoshuai.regularexpression;

public class RegularBase {
    // 正则表达式:检验字符串是否满足规则,在一段文本中查找满足需求的内容。

    // 字符类(只匹配一个字符)
    // [abc]:只能是a,b或c
    // [^abc]:除了a,b,c之外的任何字符
    // [a-zA-Z]:a到z A-Z(包括范围)
    // [a-d[m-p]]:a到d,或m到p
    // [a-z&&[def]]:a-z和def的交集(d,e,f)
    // [a-z&&[^bc]]:a-z和非bc的交集。(等同于[ad-z])
    // [a-z&&[^m-p]]:a到z和除了m到p的交集(等同于[a-lq-z])

    // 预定义字符(只匹配一个字符)
    // .:任何字符
    // \d:一个数字([0-9])
    // \D:非数字([^0-9])
    // \s:一个空白字符([\t\n\xOB\f\r])
    // \S:非空白字符:[^\s]
    // \w:[a-zA-Z_0-9]英文、数字、下划线
    // \W:[^\w]一个非单词字符





}
