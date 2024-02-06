package com.fengxiaoshuai.abstractclass;

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("小狗",3);
        Sheep sheep = new Sheep("小羊",2);
        Frog frog = new Frog("青蛙",1);
        System.out.append(dog.toString());
        dog.eat();
        dog.drinkWater();
        System.out.append(sheep.toString());
        sheep.eat();
        sheep.drinkWater();
        System.out.append(frog.toString());
        frog.eat();
        frog.drinkWater();
    }
}
