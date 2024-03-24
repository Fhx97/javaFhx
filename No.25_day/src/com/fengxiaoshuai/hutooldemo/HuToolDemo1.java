package com.fengxiaoshuai.hutooldemo;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;

import java.io.File;

public class HuToolDemo1 {
    public static void main(String[] args) {
        File file = FileUtil.file("../../../output","fx","h","x","fhx.txt");
        System.out.println(file);
        FileUtil.touch(file);
    }
}
