package com.fengxiaoshuai.fightgame;

public class PlayGame {
    public static void main(String[] args) {
        User user_1 = new User("乔峰",100,12);
        User user_2 = new User("鸠摩智",110,10);
        int user1_hp = user_1.getHp();
        int user1_atk = user_1.getAtk();
        String user1_name = user_1.getName();
        int user2_hp = user_2.getHp();
        int user2_atk = user_2.getAtk();
        String user2_name = user_2.getName();
        outerloop:
        while(true){
            user1_hp = user1_hp - user2_atk;
            if(user1_hp<=0){
                System.out.println(user2_name+"举起拳头打了"+user1_name+"一下,"+"造成了"+user2_atk+"点伤害,"+user1_name+"还剩"+user1_hp+"点血。");
                break outerloop;
            }else{
                System.out.println(user2_name+"举起拳头打了"+user1_name+"一下,"+"造成了"+user2_atk+"点伤害,"+user1_name+"还剩"+user1_hp+"点血。");
            }
            user2_hp = user2_hp - user1_atk;
            if(user2_hp<=0){
                System.out.println(user1_name+"举起拳头打了"+user2_name+"一下,"+"造成了"+user1_atk+"点伤害,"+user2_name+"还剩"+user2_hp+"点血。");
                break outerloop;
            }else{
                System.out.println(user1_name+"举起拳头打了"+user2_name+"一下,"+"造成了"+user1_atk+"点伤害,"+user2_name+"还剩"+user2_hp+"点血。");
            }

        }
        if (user1_hp < 0){
            System.out.println(user2_name+"KO了"+user1_name+"!");
        }else{
            System.out.println(user1_name+"KO了"+user2_name+"!");
        }


    }
}
