package com.fengxiaoshuai.interfacedemo2;

public class PingPongCoach extends Person implements SpeakEnglish{

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球！");

    }

    @Override
    public void speakEnglish() {
        System.out.println("讲英语！");
    }
}
