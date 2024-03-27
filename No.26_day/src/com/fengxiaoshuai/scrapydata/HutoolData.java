package com.fengxiaoshuai.scrapydata;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.List;

public class HutoolData {
    public static void main(String[] args) {
        // 定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        // 请求网页
        // 获取百家姓
        String familyNameStr = HttpUtil.get(familyNameNet);
        List<String> familyNameTemp = ReUtil.findAll("(<div class=\"text\">)(.)(</div>)",familyNameStr, 2);
        List<String> familyNameList = familyNameTemp.subList(0,familyNameTemp.size()-8);
        // 获取男生名字
        String boyNameStr = HttpUtil.get(boyNameNet);
        List<String> boyNameTemp = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)",boyNameStr,1);
        int boyStart = boyNameTemp.indexOf("月星");
        int boyEnd = boyNameTemp.indexOf("博庭");
        List<String> boyNameList = boyNameTemp.subList(boyStart, boyEnd + 1);
        // 获取女生名字
        String girlNameStr = HttpUtil.get(girlNameNet);
        List<String> girlNameTemp = ReUtil.findAll("(<p>)(.{14})(</p>)",girlNameStr,2);
        List<String> girlNameTemp1 = girlNameTemp.subList(1, girlNameTemp.size());
        ArrayList<String> girlNameList = new ArrayList<>();
        for (int i = 0; i < girlNameTemp1.size(); i++) {
            String[] s = girlNameTemp1.get(i).split(" ");
            for (int j = 0; j < s.length; j++) {
                girlNameList.add(s[j]);
            }
        }
        System.out.println(girlNameList);

    }
}
