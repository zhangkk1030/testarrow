package arrow_offer;

import java.util.ArrayList;

//一个链表，从尾到头输出每一个节点的值

public class eg3 {
	ArrayList<Integer> arraylist = new ArrayList<>();
	public ArrayList<Integer> printListFromTailtoHead(ListNode listNode){
		if(listNode!=null) {	//若当前节点不为空，则输出下一个节点
			this.printListFromTailtoHead(listNode.next);
			arraylist.add(listNode.val);
		}
		return arraylist;
}
	
	
}
