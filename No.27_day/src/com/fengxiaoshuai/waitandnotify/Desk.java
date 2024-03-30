package com.fengxiaoshuai.waitandnotify;

public class Desk{
    /*
     * 控制生产者和消费者的执行
     *
     */
    public static int foodFlag = 0;
    public static int count = 10;
    public static Object lock = new Object();

}
