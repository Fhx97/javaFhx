package fhx.test;

public class LoopBetter {
    public static void main(String[] args) {
        // 无限循环
        // while (true){System.out.println("丰小帅！！！");}

        // continue:结束本次循环,开启下次循环。
        // break:结束整个循环。

        // 逢七过
        for(int i = 1;i <= 100;i++){
            if (i % 7 == 0 || i % 10 == 7 || i / 10 ==7){
                System.out.println('过');
                continue;
            }
            System.out.println(i);
        }

    }
}
