package com.fengxiaoshuai.threaddemo4;

public class MyThread extends Thread{
    // 表示该类所有的对象,都共享static数据
    static int ticket = 0;
    // 锁对象:一定要是唯一的
    static Object obj = new Object();


    @Override
    public void run() {
        while (true){
        synchronized (obj){
            if(ticket<100){
                ticket++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getName()+"正在卖第"+ticket+"张票！");
            }else{
                System.out.println("售罄！售罄！");
                return;
            }
        }
    }}
}
