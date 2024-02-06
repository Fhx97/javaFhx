public class VariableTest{
	public static void main(String[] args){
		// 一开始没有乘客
		int a = 0;
		// 第一站:上去一位乘客
		a = a + 1;
		// 第二站:上去两位乘客,下来一位乘客
		a = a + 2 - 1;
		// 第三站:上去两位乘客,下来一位乘客
		a = a + 2 - 1;
		// 第四站:下来一位乘客
		a = a - 1;
		// 第五站:上来一位乘客
		a = a + 1;
		// 到达终点站,车上一共几位乘客
		System.out.println("到达终点站共有:"+ a + '人');
	}
}