package com.fengxiaoshuai.myexception;

public class ExceptionDemo1 {
    // 如果try没遇到问题,会把try里面的代码全部执行完毕,不会执行catch里面的代码
    // 如果try中可能会遇到多个问题,会写多个catch与之对应,父类异常需要写在下面
    // 如果try中遇到的问题没有被捕获,try...catch...白写,当前异常会被虚拟机处理
    // 如果try中遇到问题,try下面的代码就不会执行了
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            // 如果出现了ArrayIndexOutOfBoundsException异常,如何处理
//            System.out.println("索引越界了！");
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("冲冲冲冲冲冲冲！！！");
    }
}
