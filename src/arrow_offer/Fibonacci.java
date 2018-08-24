package arrow_offer;

import java.util.Scanner;

public class Fibonacci {
	//	输入一个整数n，输出斐波那契数列的第n项
//	斐波那契数列后一项等于前两项之和
	public static int Fibonacci_s(int x) {
		int result = 0;
		int prepre=0;
		int pre=1;
		if(x<=1)
			return x;
		else {
		for (int i = 0; i < x; i++) {
			result=prepre+pre;
			prepre=pre;
			pre=result;
		}
		return result;
		}
	}
	public static void main(String[] args) {
//		初始化
		
		System.out.println("请输入n");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = Fibonacci_s(input);
		System.out.println("则斐波那契数列第n项为"+result);
	}
}
