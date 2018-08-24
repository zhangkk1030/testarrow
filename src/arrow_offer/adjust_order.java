package arrow_offer;

import java.util.ArrayList;
//调整数组中数字的顺序，所有奇数在前半部分，所有偶数在后半部分
public class adjust_order extends swap_Integer {
//	int类型是放在栈空间的,Integer是作为对象放在堆空间的
	public static int [] adjust(int[] arr) {
		int [] result = new int [arr.length]; 
		ArrayList<Integer>front = new ArrayList<Integer>();
		ArrayList<Integer>rear = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				front.add(arr[i]);
			}else {
				rear.add(arr[i]);
			}
		}
		for (int i = 0; i < front.size(); i++) {
			result[i]=front.get(i);
		}
		for (int i = 0; i < rear.size(); i++) {
			result[i+front.size()] = rear.get(i);
		}
		return result;
	}
	
//	另一个思路：前偶后奇就交换
	public static Integer[] reOrderArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j > i; j--) {
				if(arr[j]%2==1 && arr[j-1]%2==0) {
					swap(arr[j],arr[j-1]);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		//
		int [] test = {2,1,4,5,9,8,7};
		int [] out = adjust(test);
		Integer [] test1 = {2,1,4,5,9,8,7};
		Integer [] out1 = reOrderArray(test1);
		for (int i : out) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for (int j : out1) {
			System.out.print(j+" ");
		}
		//
		//下面为什么交换后3变成了7？上面注释就是3,5
		System.out.println("");
		Integer[] ttt= {3,5};
		swap(ttt[0],ttt[1]);
		System.out.print(ttt[0]+""+ttt[1]);
	}
}
