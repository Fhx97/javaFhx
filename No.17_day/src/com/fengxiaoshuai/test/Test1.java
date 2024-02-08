package com.fengxiaoshuai.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Alice",18,168);
        Girl girl2 = new Girl("Juice",19,170);
        Girl girl3 = new Girl("Anna",18,169);
        Girl girl4 = new Girl("Lina",18,168);
        Girl[] girls = {girl1,girl2,girl3,girl4};
        System.out.println(Arrays.toString(girls));
        Arrays.sort(girls, new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                if(o1.getAge() != o2.getAge()){
                    return o1.getAge() - o2.getAge();
                }else{
                    if(o1.getHeight() != o2.getHeight()){
                        return (int) (o1.getHeight()-o2.getHeight());
                    }else{
                        if(o1.getName().equals(o2.getName())){
                            return 0;
                        }else {
                            return o1.getName().compareTo(o2.getName());
                        }
                    }
                }
            }
        });
        System.out.println(Arrays.toString(girls));


    }
}
