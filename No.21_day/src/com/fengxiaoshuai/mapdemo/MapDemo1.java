package com.fengxiaoshuai.mapdemo;

import java.util.*;

public class MapDemo1 {
    // 定义一个Map集合,键用表示省份名称province,值表示市city,但是市会很多
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> cityBJ = new ArrayList<>();
        Collections.addAll(cityBJ,"东城区","西城区","朝阳区","丰台区","石景山区",
                            "海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区",
                            "大兴区","怀柔区","平谷区","密云区","延庆区");
        ArrayList<String> citySH = new ArrayList<>();
        Collections.addAll(citySH,"黄浦区","徐汇区","长宁区","静安区","普陀区",
                           "虹口区","杨浦区","闵行区","宝山区","嘉定区","浦东新区","金山区",
                            "松江区","青浦区","奉贤区","崇明区");
        ArrayList<String> cityHZ = new ArrayList<>();
        Collections.addAll(cityHZ,"上城区","下城区","江干区","拱墅区","西湖区",
                            "滨江区","萧山区","余杭区","临安区","富阳区");
        hm.put("北京",cityBJ);
        hm.put("上海",citySH);
        hm.put("杭州",cityHZ);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(" ,","","");
            for (String string : value) {
                sj.add(string);
            }
            System.out.println(key + "=" + sj);
        }


    }
}
