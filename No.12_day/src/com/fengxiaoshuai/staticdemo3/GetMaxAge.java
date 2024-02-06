package com.fengxiaoshuai.staticdemo3;

import java.util.ArrayList;

public class GetMaxAge {
    private GetMaxAge(){}

    // 获取集合中的最大学生的年龄
    public static int getMaxAge(ArrayList<Student> arr){
        int maxAge = arr.get(0).getAge();
        for (int i = 1; i < arr.size(); i++) {
            if(maxAge<=arr.get(i).getAge()){
                maxAge = arr.get(i).getAge();
            }
        }
        return maxAge;
    }

}
