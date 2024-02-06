package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class MoneyTran {
    public static void main(String[] args) {
        System.out.println("请输入您的金额:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] num_array = {'0','1','2','3','4','5','6','7','8','9'};
        char[] Chinese_num = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        char[] unit_array = {'佰','拾','万','仟','佰','拾','元'};
        char[] out_array = new char[14];
        char[] arr = {'零','零','零','零','零','零','零'};
        for (int i = str.length()-1; i>=0 ; i--) {
            for (int j =0; j < num_array.length; j++) {
                if(str.charAt(i)==num_array[j]){
                    arr[i+arr.length-str.length()] = Chinese_num[j];
                }
            }
        }
        for (int i = 0; i < out_array.length; i++) {
            if(i%2!=0){
                out_array[i] = unit_array[(i-1)/2];
            }else{
                out_array[i] = arr[i/2];
            }

        }
        String out_str = new String(out_array);
        System.out.println(out_str);

    }
}
