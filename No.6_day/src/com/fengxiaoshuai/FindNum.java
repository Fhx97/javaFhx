package com.fengxiaoshuai;

public class FindNum {
    public static void main(String[] args) {
        int count = 0;
        for(int i=101;i<=200;i++){
            boolean flag = true;
            for(int j = 2;j<(i/2);j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count+=1;
                System.out.print(i+" ");
            }

        }
        System.out.println("一共有"+count+"个质数！");
    }
}
