package com.fengxiaoshuai.interfacedemo2;

public class TestDemo {
    public static void main(String[] args) {
        BasketballCoach basketballCoach = new BasketballCoach("丰小帅",18);
        BasketballPlayer basketballPlayer = new BasketballPlayer("丰大帅",15);
        PingPongCoach pingPongCoach= new PingPongCoach("赵小六",18);
        PingPongPlayer pingPongPlayer = new PingPongPlayer("王小五",19);

        System.out.println(basketballCoach.toString());
        basketballCoach.work();
        System.out.println(basketballPlayer.toString());
        basketballPlayer.work();
        System.out.println(pingPongCoach.toString());
        pingPongCoach.work();
        pingPongCoach.speakEnglish();
        System.out.println(pingPongPlayer.toString());
        pingPongPlayer.work();
        pingPongPlayer.speakEnglish();
    }
}
