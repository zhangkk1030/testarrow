package arrow_offer;

import java.util.Scanner;

public class Fibonacci {
	//	����һ������n�����쳲��������еĵ�n��
//	쳲��������к�һ�����ǰ����֮��
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
//		��ʼ��
		
		System.out.println("������n");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = Fibonacci_s(input);
		System.out.println("��쳲��������е�n��Ϊ"+result);
	}
}
