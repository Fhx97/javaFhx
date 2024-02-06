package com.fengxiaoshuai.arraytest;

import java.util.Scanner;

public class InputInfo {
    private String brand;
    private double price;
    private String color;

    public InputInfo() {
    }

    public InputInfo(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汽车品牌:");
        this.brand = sc.next();
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汽车价格:");
        this.price = sc.nextDouble();
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汽车颜色:");
        this.color = sc.next();
    }

    public String toString() {
        return "InputInfo{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
