package arrow_offer;

public class frog {
//	��������һ�ο�����һ��̨�׻�������̨��������n��̨��ʱ�ж�������������Fibonacci����
//	���⣬��������һ�ο�����1��̨�ף�2��̨�ף�n��̨�ף�����������n��̨��ʱ�ж���������
//	f(1)=1	f(2)=f(1)+1	f(3)=f(2)+f(1)+1 f(4)=f(3)+f(2)+f(1)+1
	public static int forg_num(int n) {
		if(n==1)
			return 1;
		else
			return 2*forg_num(n-1);
	}
	
	public static void main(String[] args) {
		int out = forg_num(10);
		System.out.println(out);
	}
}
