import java.util.Random;

public class TwoArray {
    public static void main(String[] args) {
        // 二维数组静态初始化
        int[][] arr_1 = new int[][]{{11,22},{33,44}};
        // 二维数组中的一维数组一般都是换行显示;
        int[][] arr_2 = {
                {55,66},
                {77,88}};
        // 二维数组中的索引
        System.out.println(arr_1[0][1]);
        // 二维数组遍历
        for (int i = 0; i < arr_1.length; i++) {
            for(int j =0;j<arr_1[i].length;j++){
                System.out.print(arr_1[i][j]+" ");
            }
            System.out.print("\n");
        }
        // 二维数组动态初始化
        // 数据额类型[][] 数组名 = new 数据类型[m][n]
        // m表示可以放多少个一维数组,n表示每一个一维数组可以存放多少个元素
        int[][] arr_3 = new int[3][5];
        Random r = new Random();
        for (int i = 0; i < arr_3.length; i++) {
            for(int j =0;j<arr_3[i].length;j++){
                arr_3[i][j] = r.nextInt(100);
            }

        }
        for (int i = 0; i < arr_3.length; i++) {
            for(int j =0;j<arr_3[i].length;j++){
                System.out.print(arr_3[i][j]+" ");
            }
            System.out.print("\n");
        }

        int[][] arr_4 = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int year_sum = 0;
        for (int i = 0; i < arr_4.length; i++) {
            int quarter_sum=0;
            for(int j = 0;j < arr_4[i].length;j++){
                quarter_sum+=arr_4[i][j];
            }
            System.out.println("第"+(i+1)+"季度营业额为"+quarter_sum+"万元");
            year_sum += quarter_sum;

        }
        System.out.println("全年总营业额为:"+year_sum+"万元");

    }
}
