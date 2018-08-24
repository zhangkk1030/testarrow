package arrow_offer;

import java.util.ArrayList;
//�������������ֵ�˳������������ǰ�벿�֣�����ż���ں�벿��
public class adjust_order extends swap_Integer {
//	int�����Ƿ���ջ�ռ��,Integer����Ϊ������ڶѿռ��
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
	
//	��һ��˼·��ǰż����ͽ���
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
		//����Ϊʲô������3�����7������ע�;���3,5
		System.out.println("");
		Integer[] ttt= {3,5};
		swap(ttt[0],ttt[1]);
		System.out.print(ttt[0]+""+ttt[1]);
	}
}
