package com.fengxiaoshuai.innerclass;

public class Car {
    private String brand;
    private double autoAge;
    private String color;
    // 内部类表示的事物是外部类的一部分,内部类单独出现没有任何意义。
    class Engine{
        private String engineBrand;
        private double engineAge;

        public void show(){
            System.out.println(engineBrand);
            System.out.println(brand);
        }
    }



}
