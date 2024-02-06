package com.fengxiaoshuai.inheritdemo;

public class TestDemo {
    // 子类只能访问父类中非私有的成员。
    public static void main(String[] args) {
        Cat cat_1 = new Cat();
        cat_1.setName("布偶猫");
        cat_1.eatFood();
        cat_1.drinkWater();
        cat_1.catchMouse();

        Cat cat_2 = new Cat();
        cat_2.setName("中国狸花猫");
        cat_2.eatFood();
        cat_2.drinkWater();
        cat_2.catchMouse();

        Husky husky = new Husky();
        husky.setName("哈士奇");
        husky.eatFood();
        husky.drinkWater();
        husky.lookHouse();
        husky.tearHome();

        Teddy teddy = new Teddy();
        teddy.setName("泰迪");
        teddy.eatFood();
        teddy.drinkWater();
        teddy.lookHouse();
        teddy.rubPlay();
    }
}
