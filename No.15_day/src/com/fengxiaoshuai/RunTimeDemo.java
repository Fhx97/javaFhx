package com.fengxiaoshuai;

import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);

        // 停止虚拟机
        // Runtime.getRuntime().exit(0);

        // 获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // JVM能从系统中获取的总内存大小(单位:byte)
        System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));

        // JVM已经从系统中获取总内存大小(单位:byte)
        System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024));

        // JVM剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));

        // 运行cmd命令
        // shutdown:关机
        // 加上参数才能执行: -s 默认1分钟之后关机
        // -s -t指定时间 指定关机时间
        // -a 取消关机操作
        // -r 关机并重启
        Runtime.getRuntime().exec("shutdown -s -t 60");


    }
}
