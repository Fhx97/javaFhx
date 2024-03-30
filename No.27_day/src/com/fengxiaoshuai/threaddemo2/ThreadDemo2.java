package com.fengxiaoshuai.threaddemo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo2 {
    /*
    * 可获取线程返回结果,不能直接使用Thread类中的方法
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();
        System.out.println(ft.get());

    }
}
