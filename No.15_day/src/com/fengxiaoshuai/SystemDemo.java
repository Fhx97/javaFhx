package com.fengxiaoshuai;

public class SystemDemo {
    public static void main(String[] args) {
        // 0:当前虚拟机是正常停止;非0(一般为1)表示当前虚拟机异常停止。
        // System.exit(0);
        // System.out.println("是否执行！");
        // long l = System.currentTimeMillis();
        // System.out.println(l);

        // 拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        // 把arr1数组中的数据拷贝到arr2中
        // 参数一:数据源,要拷贝的数据。从哪个数组而来。
        // 参数二:从数据源数组中的第几个索引开始索引。
        // 参数三:目的地,要把数据拷贝到哪个数组中。
        // 参数四:目的地数组的索引。
        // 参数五:拷贝的个数。
        System.arraycopy(arr1,0,arr2,4,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        // 如果数据源数组和目的地数组都是基本数据类型,那么两者的类型必须保持一致,否则会报错。
        // 在拷贝的时候需要考虑数组的长度,如果超出范围会报错。
        // 如果数据源数组和目的地数组都是引用数据类型,那么子类型可以赋值给父类类型。
        }
    }
}
