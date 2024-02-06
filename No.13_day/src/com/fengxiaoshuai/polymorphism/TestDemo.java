package com.fengxiaoshuai.polymorphism;

public class TestDemo {
    public static void main(String[] args) {
        Animal dog = new Dog(2,"黑颜色的");
        Animal cat = new Cat(3,"灰颜色的");
        Person person1 = new Person("老王",30);
        Person person2 = new Person("老李",25);
        person1.keepPet(dog,"两只前腿死死的抱住骨头猛吃");
        person2.keepPet(cat,"眯着眼睛侧着头吃鱼");
    }
}
