package com.fengxiaoshuai;

public class VarScope {
    // 成员变量和局部变量:就近原则,要输出成员变量(this.变量名)
    private int num;

    public void method(){
        int num = 66;
        // 谁近用谁
        System.out.println(num);
    }
}
