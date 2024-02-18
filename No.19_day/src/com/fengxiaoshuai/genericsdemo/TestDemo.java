package com.fengxiaoshuai.genericsdemo;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<LihuaCat> list1 = new ArrayList<>();
        keepPet(list1);

    }
    public static void keepPet(ArrayList<? extends Cat> list){

    }

}
