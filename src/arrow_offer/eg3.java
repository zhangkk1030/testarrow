package arrow_offer;

import java.util.ArrayList;

//һ��������β��ͷ���ÿһ���ڵ��ֵ

public class eg3 {
	ArrayList<Integer> arraylist = new ArrayList<>();
	public ArrayList<Integer> printListFromTailtoHead(ListNode listNode){
		if(listNode!=null) {	//����ǰ�ڵ㲻Ϊ�գ��������һ���ڵ�
			this.printListFromTailtoHead(listNode.next);
			arraylist.add(listNode.val);
		}
		return arraylist;
}
	
	
}
