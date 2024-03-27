package com.fengxiaoshuai.scrapydata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScrapyData {
    public static void main(String[] args) throws IOException {
        // 定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        // 通过正则表达式,把符合要求的数据提取出来
        ArrayList<String> familyNameListTemp = getData(familyNameStr, "(<div class=\"text\">)(.)(</div>)", 2);
        List<String> familyNameList = familyNameListTemp.subList(0,398);
        ArrayList<String> boyNameListTemp = getData(boyNameStr, "(.{2})(、|。)", 1);
        int boyStart = boyNameListTemp.indexOf("月星");
        int boyEnd = boyNameListTemp.indexOf("博庭");
        List<String> boyNameList = boyNameListTemp.subList(boyStart, boyEnd + 1);
        ArrayList<String> girlNameListTemp = getData(girlNameStr, "(<p>)(.{14})(</p>)", 2);
        List<String> girlNameListTemp1 = girlNameListTemp.subList(1, girlNameListTemp.size());
        ArrayList<String> girlNameList = new ArrayList<>();
        for (int i = 0; i < girlNameListTemp1.size(); i++) {
            String[] s = girlNameListTemp1.get(i).split(" ");
            for (int j = 0; j < s.length; j++) {
                girlNameList.add(s[j]);
            }
        }

        ArrayList<String> finalName = generateData(familyNameList,boyNameList,girlNameList,70,50);
        Collections.shuffle(finalName);
        // 写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("../No.26_day/output/names.txt"));
        for (String s : finalName) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
    /*
    * 生成数据
    * 姓名(唯一)-性别-年龄
    * */
    public static ArrayList generateData(List<String> familyNameList,List<String> boyNameList,
                                         ArrayList<String> girlNameList,int boyNum,int girlNum){
        // 生成男生不重复的名字
        HashSet<String> boys = new HashSet<>();
        while (true){
            if (boys.size() == boyNum){
                break;
            }
            // 随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boys.add(familyNameList.get(0)+boyNameList.get(0));
        }
        // 生成不重女生复的名字
        HashSet<String> girls = new HashSet<>();
        while (true){
            if (girls.size() == girlNum){
                break;
            }
            // 随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girls.add(familyNameList.get(0)+girlNameList.get(0));
        }
        // 用于存放所有男生女生的信息
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (String boy : boys) {
            int age = r.nextInt(5)+20;
            list.add(boy+"-男-"+age);
        }
        for (String girl : girls) {
            int age = r.nextInt(5)+20;
            list.add(girl+"-女-"+age);
        }
        return list;
    }

    /*
     * 作用:根据正则表达式获取字符串中的数据
     * 参数一:完整的字符串
     * 参数二:正则表达式
     * 参数三:捕获分组,获取真正的数据
     * */
    private static ArrayList<String> getData(String familyNameStr, String regex, int index) {
        // 创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        // 按照正则表达式的规则,去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则到str中去获取数据
        Matcher matcher = pattern.matcher(familyNameStr);
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);

        }
        return list;
    }

    /*
     * 作用:从网络上爬取数据,把数据拼接成字符串返回
     * 形参:网址
     * 返回值:爬取到的所有数据
     * */
    public static String webCrawler(String net) throws IOException {
        // 定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        // 创建一个url对象
        URL url = new URL(net);
        // 网址链接
        URLConnection conn = url.openConnection();
        // 读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        // 释放资源
        isr.close();
        // 返回字符串
        return sb.toString();

    }
}
