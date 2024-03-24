package com.fengxiaoshuai.commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("../No.25_day/output/f1.txt"),new File("../No.25_day/output/comf1.txt"));
        FileUtils.copyDirectory(new File("../No.25_day/output"),new File("../No.25_day/output/copy"));
    }
}
