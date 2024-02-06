package com.fhx.fengxiaoshuai;

public class MethodDemo_6 {
    public static void main(String[] args) {
        int a = 1;
        char b = 1;
        long c = 1;
        int  d = 1;
        getCom(a,a);
        getCom(a,b);
        getCom(a,c);
        getCom(a,d);
        getCom(b,b);
        getCom(b,c);
        getCom(b,d);
        getCom(c,c);
        getCom(c,d);
        getCom(d,d);




    }
    // 方法重载:在同一个类中定义了多个同名的方法,这些方法具有同种功能。
    // 每个方法具有不同的参数类型或参数个数,这些同名的方法,就构成了重载关系。
    // 在同一个类中,方法名相同,参数不同的方法。与返回值无关。
    // 参数不同:个数不同,类型不同,顺序不同。
    // 虚拟机会跟参数不同来区分同名方法。
    // 顺序不同可以构成重载,但不建议。


    // 比较两个整数是否相同(兼容全数据类型)
    public static void getCom(byte num_1,short num_2){
        if ((short)num_1 == (short)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(short num_1,byte num_2){
        if ((short)num_1 == (short)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(int num_1,byte num_2){
        if ((int)num_1 == (int)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(byte num_1,int num_2){
        if ((int)num_1 == (int)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(long num_1,byte num_2){
        if ((long)num_1 == (long)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(byte num_1,long num_2){
        if ((long)num_1 == (long)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(short num_1,int num_2){
        if ((int)num_1 == (int)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(int num_1,short num_2){
        if ((int)num_1 == (int)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(short num_1,long num_2){
        if ((long)num_1 == (long)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(long num_1,short num_2){
        if ((long)num_1 == (long)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(int num_1,long num_2){
        if ((long)num_1 == (long)num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(long num_1,long num_2){
        if (num_1 == num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(int num_1,int num_2){
        if (num_1 == num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(short num_1,short num_2){
        if (num_1 == num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }

    public static void getCom(byte num_1,byte num_2){
        if (num_1 == num_2){
            System.out.println("两个数相同！");
        }else{
            System.out.println("两个数不同！");
        }
    }


}
