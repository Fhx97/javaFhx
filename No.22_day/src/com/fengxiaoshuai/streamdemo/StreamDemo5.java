package com.fengxiaoshuai.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList,"丰小帅,18","丰中帅,19","丰大帅,20",
                            "张三,30","李四,32","王五,36");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList,"刘亦菲,18","张柏芝,20","高圆圆,19",
                    "章若楠,18","王嫣然,19","向秋,20");
        Map<String, String> result = Stream.concat(boyList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2),
                        girlList.stream().filter(s -> s.startsWith("刘")))
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(result);
    }
}
