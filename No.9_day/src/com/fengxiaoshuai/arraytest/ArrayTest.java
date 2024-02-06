package com.fengxiaoshuai.arraytest;

public class ArrayTest {
    public static void main(String[] args) {
        InputInfo[] arr = new InputInfo[3];
        InputInfo car_1 = new InputInfo();
        car_1.setBrand();
        car_1.setPrice();
        car_1.setColor();

        InputInfo car_2 = new InputInfo();
        car_2.setBrand();
        car_2.setPrice();
        car_2.setColor();

        InputInfo car_3 = new InputInfo();
        car_3.setBrand();
        car_3.setPrice();
        car_3.setColor();

        arr[0] = car_1;
        arr[1] = car_2;
        arr[2] = car_3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+","+arr[i].getPrice()+","+arr[i].getColor());
        }


    }
}
