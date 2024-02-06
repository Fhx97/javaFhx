package com.fengxiaoshuai;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g = new GirlFriend();
        System.out.println(g);
        g.age = 20;
        g.height = 168;
        g.weight = 90;
        g.place = "江西";
        g.hobby = "睡觉";
        System.out.println("年龄:"+g.age);
        System.out.println("身高:"+g.height);
        System.out.println("体重:"+g.weight);
        System.out.println("籍贯:"+g.place);
        System.out.println("爱好:"+g.hobby);

        g.sleep();
        g.dateMeeting();
    }
}
