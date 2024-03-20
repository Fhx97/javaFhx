package com.fengxiaoshuai.myexception;

public class ExceptionDemo2 {
    // throws:写在方法定义处,表示声明一个异常，告诉调用者,使用本方法可能会有哪些异常
    // 编译时异常:必须要写;运行时异常:可以不写。

    // throw:写在方法内,结束方法;手动抛出异常对象,交给调用者,方法中下面的代码不再执行了。
    public static void main(String[] args) {
        int[] arr = new int[0];
        int max = getMax(arr);
        System.out.println(max);

    }

    public static int getMax(int[] arr) {
        if(arr == null){
            // 手动创建一个异常对象,并把这个异常交给调用者
            // 此时方法就会结束,下面的代码就不会执行了
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}