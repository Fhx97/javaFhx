package com.fengxiaoshuai.setdemo;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone phone_1 = new Phone("小米",1000);
        Phone phone_2 = new Phone("苹果",8000);
        Phone phone_3 = new Phone("锤子",2999);
        phones.add(phone_1);
        phones.add(phone_2);
        phones.add(phone_3);
        ArrayList<Phone> phones_new = getPhone(phones);
        for (int i = 0; i < phones_new.size(); i++) {
            System.out.println(phones_new.get(i).getBrand()+","+phones_new.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> phones){
        ArrayList<Phone> phones_new = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if(phones.get(i).getPrice()<3000){
                phones_new.add(phones.get(i));
            }
        }
        return phones_new;
    }
}
