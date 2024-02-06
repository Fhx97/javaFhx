package com.fengxiaoshuai.fightgame;

import java.util.Random;

public class PlayGameTest {
    public static void main(String[] args) {

        UserOpt role_1 = new UserOpt("张飞",100,'男',null,null,null);
        UserOpt role_2 = new UserOpt("貂蝉",100,'女',null,null,null);
        // 根据性别随机选择面部特征
        FaceTrait face = new FaceTrait();
        face.facetrait(role_1);
        Random r = new Random();

        // 攻击描述
        String[] attacks_desc={
                "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
                "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
                "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
                "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
                "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
                "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
        };

        // 受伤描述
        String[] injureds_desc={
                "结果%s退了半步，毫发无损",
                "结果给%s造成一处瘀伤",
                "结果一击命中，%s痛得弯下腰",
                "结果%s痛苦地闷哼了一声，显然受了点内伤",
                "结果%s摇摇晃晃，一跤摔倒在地",
                "结果%s脸色一下变得惨白，连退了好几步",
                "结果『轰』的一声，%s口中鲜血狂喷而出",
                "结果%s一声惨叫，像滩软泥般塌了下去"
        };

        // 开始攻击
        while (true) {
            if (role_1.getHp() <= 0) {
                System.out.println(role_2.getName() + "最终打败了" + role_1.getName() + "!");
                break;
            } else {
                int attacks_index = r.nextInt(6);
                // "%n"换行符,与"\n"具有相同作用。
                System.out.printf((attacks_desc[attacks_index]) + "%n", role_1.getName(), role_2.getName());
                role_1.attack(role_2);
                if (role_2.getHp() > 90){
                    System.out.printf((injureds_desc[0]) + "%n", role_2.getName());
                }else if(role_2.getHp()> 80 && role_2.getHp() <= 90){
                    System.out.printf((injureds_desc[1]) + "%n", role_2.getName());}
                else if(role_2.getHp() > 70 && role_2.getHp() <= 80){
                    System.out.printf((injureds_desc[2]) + "%n", role_2.getName());
                }else if(role_2.getHp() > 60 && role_2.getHp() <= 70){
                    System.out.printf((injureds_desc[3]) + "%n", role_2.getName());}
                else if(role_2.getHp() > 40 && role_2.getHp() <= 60){
                    System.out.printf((injureds_desc[4]) + "%n", role_2.getName());
                }else if(role_2.getHp() > 30 && role_2.getHp() <= 40){
                    System.out.printf((injureds_desc[5]) + "%n", role_2.getName());
                }else if(role_2.getHp() > 10 && role_2.getHp() <= 30){
                    System.out.printf((injureds_desc[6]) + "%n", role_2.getName());
                }else if(role_2.getHp() <= 10){
                    System.out.printf((injureds_desc[7]) + "%n", role_2.getName());
                }

            }

            if (role_2.getHp() <= 0) {
                System.out.println(role_1.getName() + "最终打败了" + role_2.getName() + "!");
                break;
            } else {
                int attacks_index = r.nextInt(6);
                System.out.printf((attacks_desc[attacks_index]) + "%n", role_2.getName(), role_1.getName());
                role_2.attack(role_1);
                if (role_1.getHp() > 90){
                    System.out.printf((injureds_desc[0]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 80 && role_1.getHp() <= 90){
                    System.out.printf((injureds_desc[1]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 70 && role_1.getHp() <= 80){
                    System.out.printf((injureds_desc[2]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 60 && role_1.getHp() <= 70){
                    System.out.printf((injureds_desc[3]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 40 && role_1.getHp() <= 60){
                    System.out.printf((injureds_desc[4]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 30 && role_1.getHp() <= 40){
                    System.out.printf((injureds_desc[5]) + "%n", role_1.getName());
                }else if(role_1.getHp() > 10 && role_1.getHp() <= 30){
                    System.out.printf((injureds_desc[6]) + "%n", role_1.getName());
                }else if(role_1.getHp()<=10){
                    System.out.printf((injureds_desc[7]) + "%n", role_1.getName());
                }

            }


        }
    }
}
