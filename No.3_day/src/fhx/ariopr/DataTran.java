package fhx.ariopr;



public class DataTran {
    public static void main(String[] args) {
        // 取值范围
        // byte < short < int < long < float < double
        // 数据转换时
        // 取值范围小的,和取值范围大的进行运算,小的会提升为大的,再进行运算
        // byte、short、char三种类型的数据在运算时,都会先提升为int,在进行运算
        // 强制转换,有可能会出现错误
        double a = 12.3;
        int b = (int) a;
        System.out.println(b);
        // 字符串"+"操作表示字符串拼接,从左自由逐个执行
        System.out.println(8.8+"fx");
        System.out.println("fx"+true);
        System.out.println("哥们有"+b+"块钱！");
        System.out.println(1 + 2 + "fx" + 1 + 2);
        // 字符相加,'a' = 97(ASCII) ,'A' = 65(ASCII)
        char c = 'a';
        int result = c + 5;
        System.out.println(c+0);
        System.out.println(result);

    }
}
