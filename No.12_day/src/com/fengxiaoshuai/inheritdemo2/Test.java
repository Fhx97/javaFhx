package com.fengxiaoshuai.inheritdemo2;

public class Test {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.setName("哈士奇");
        husky.eatFood();
        husky.drinkWater();
        husky.lookHome();
        husky.breakHome();

        SharPei sharPei = new SharPei();
        sharPei.setName("沙皮狗");
        sharPei.eatFood();
        sharPei.drinkWater();
        sharPei.lookHome();

        TuGou tuGou = new TuGou();
        tuGou.setName("中华田园犬");
        tuGou.eatFood();
        tuGou.drinkWater();
        tuGou.lookHome();
    }
}
