package com.fengxiaoshuai.arraytest;

public class InputProduct {
    private String id;
    private String name;
    private double price;
    private int stock;

    private Object[] array = new Object[4];

    public InputProduct() {
    }

    public InputProduct(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        setArray(id, name, price, stock);
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * 获取
     *
     * @return array
     */
    public Object[] getArray() {
        return array;
    }

    /**
     * 设置
     *
     * @param array
     */
    public void setArray(String id, String name, double price, int stock) {
        array[0] = id;
        array[1] = name;
        array[2] = price;
        array[3] = stock;
        this.array = array;
    }

}



