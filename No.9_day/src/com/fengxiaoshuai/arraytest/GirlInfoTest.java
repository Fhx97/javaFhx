package com.fengxiaoshuai.arraytest;

public class GirlInfoTest {
    public static void main(String[] args) {
        GirlInfo[] arr = new GirlInfo[4];
        GirlInfo girl_1 = new GirlInfo("刘亦菲",28,'女',"跑步");
        GirlInfo girl_2 = new GirlInfo("高圆圆",32,'女',"拍照");
        GirlInfo girl_3 = new GirlInfo("张柏芝",36,'女',"听歌");
        GirlInfo girl_4 = new GirlInfo("章若楠",22,'女',"做饭");

        arr[0] = girl_1;
        arr[1] = girl_2;
        arr[2] = girl_3;
        arr[3] = girl_4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        int count = arr.length;
        int avg = sum / count;
        System.out.println("平均年龄为:"+avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<avg){
                System.out.println(arr[i].getName()+","+arr[i].getAge()+","+arr[i].getGender()+","+arr[i].getHobby());
            }
        }


    }
}
