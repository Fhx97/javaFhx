package com.fengxiaoshuai.setdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        // 创建Map集合的对象
        Map<String,String> m = new HashMap<>();

        // 添加元素(添加/覆盖)
        // put方法的细节
        // 添加数据时,如果键不存在则把键值对对象添加到map集合中
        // 添加数据时,如果键存在,则会把原有的键值对对象覆盖,会把被覆盖的值进行返回
        String v1 = m.put("郭靖","黄蓉");
        System.out.println(v1);
        m.put("韦小宝","沐剑屏");
        m.put("杨过","小龙女");
        System.out.println(m);
        String v = m.put("韦小宝","双儿");
        System.out.println(v);
        System.out.println(m);

        // 删除数据
        String v2 = m.remove("郭靖");
        System.out.println(v2);
        System.out.println(m);

        // 清空
        m.clear();
        System.out.println(m);

        // 判断是否包含
        boolean keyResult = m.containsKey("郭靖");
        System.out.println(keyResult);
        boolean valueResult = m.containsValue("黄蓉");
        System.out.println(valueResult);

        // 判断集合是否为空
        boolean result = m.isEmpty();
        System.out.println(result);

        System.out.println(m.size());



    }
}
