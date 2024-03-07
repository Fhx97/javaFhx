package com.fengxiaoshuai.doudizhu;

public class App {
    /*
    控制台实现 准备牌 洗牌 发牌
    "♠" "♣" "♥" "♦"
    "3" "4" "5" "6" "7" "8" "9" "10" "J" "Q" "K" "A" "2"
    看牌
    如果原始数据的规律非常复杂,可以手动排序让每一个数据跟唯一的序号产生对应关系
    序号就是数字,规律非常简单,后续的所有操作,以序号为准
    当真正需要操作原始数据的时候,再通过序号找到原始数据即可
    */
    public static void main(String[] args) {
        new PokerGame();
    }
}
