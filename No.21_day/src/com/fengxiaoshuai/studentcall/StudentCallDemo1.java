package com.fengxiaoshuai.studentcall;

import java.util.ArrayList;
import java.util.Random;

public class StudentCallDemo1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("丰小帅");
        students.add("丰中帅");
        students.add("丰大帅");
        for (int i = 0; i < 3; i++) {
            Random r = new Random();
            int index = r.nextInt(3);
            System.out.println(students.get(index));
        }

    }


}
