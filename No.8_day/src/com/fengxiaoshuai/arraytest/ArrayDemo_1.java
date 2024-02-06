package com.fengxiaoshuai.arraytest;

public class ArrayDemo_1 {
    public static void main(String[] args) {
        InputProduct pro_1 = new InputProduct("123","苹果",2.49,500);
        InputProduct pro_2 = new InputProduct("456","香蕉",3.49,200);
        InputProduct pro_3 = new InputProduct("789","梨子",1.49,800);
        for (int i = 0; i < pro_3.getArray().length; i++) {
            System.out.println(pro_3.getArray()[i]);
        }



    }
}
