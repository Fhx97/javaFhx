package com.fengxiaoshuai.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 获取线程池
        // 无上线线程池
//        ExecutorService pool1 = Executors.newCachedThreadPool();
        // 创建有上线的线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(4);
        // 提交任务
        pool1.submit(new RunDemo());
        pool1.submit(new RunDemo());
        pool1.submit(new RunDemo());
        pool1.submit(new RunDemo());
        pool1.submit(new RunDemo());

        // 销毁线程池
        pool1.shutdown();
    }
}
