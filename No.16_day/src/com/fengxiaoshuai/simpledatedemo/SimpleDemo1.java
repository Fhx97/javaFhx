package com.fengxiaoshuai.simpledatedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDemo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date start = sdf.parse("2023年11月11日 0:0:0");
        Date end   = sdf.parse("2023年11月11日 0:10:0");
        long startTime = start.getTime();
        long endTime = end.getTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒杀时间:");
        String person = sc.nextLine();
//        String person = "2023年11月11日 0:11:00";
        Date personTime = sdf.parse(person);
        if(personTime.getTime()>=startTime && personTime.getTime()<=endTime){
            System.out.println("参与秒杀成功！");
        }else{
            System.out.println("下次再参与吧！");
        }
    }
}
