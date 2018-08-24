package arrow_offer;

public class frog {
//	假设青蛙一次可以跳一个台阶或者两个台阶则跳上n个台阶时有多少种跳法这是Fibonacci数列
//	这题，假设青蛙一次可以跳1个台阶，2个台阶，n个台阶，则青蛙跳上n个台阶时有多少种跳法
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
