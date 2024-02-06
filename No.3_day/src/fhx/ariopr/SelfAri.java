package fhx.ariopr;

public class SelfAri {
    public static void main(String[] args) {
        // ++ 变量的值加1 ; -- 变量的值减1
        // ++/--既可以放在变量的前边,也可以放在变量的后边,单独写一行的结果一样
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        // 参与运算时,i++是先用后加,++i是先加后用
        int b = 10;
        int c = b++;
        int d = ++b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
