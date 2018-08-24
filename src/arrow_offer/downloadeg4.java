package arrow_offer;

import java.util.Arrays;

public class downloadeg4 {
	/**
	 * ����ǰ���������������ع�������
	 * @param preOrder:ǰ���������
	 * @param inOrder:�����������
	 * @return root:������
	 */
	static BinaryTree reBuildBinaryTree(Object[] preOrder,Object[] inOrder){

		//�ݹ��˳�����
		if (preOrder == null || inOrder == null || preOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		// ǰ������Ľ���ĵ�һ��Ԫ�ؼ�Ϊ�������ĸ��ڵ�
		BinaryTree root=new BinaryTree(preOrder[0]);
		
		//���ڵ�����������е�����
		int i=0;
		// ��ȡ���ڵ�����������е�����
		for (;i < inOrder.length;i++) {
			if (inOrder[i] == preOrder[0]) {
				break;
			}
		}
		
		//������������ǰ�����������
		Object[] leftPre = Arrays.copyOfRange(preOrder, 1, i + 1);
		Object[] leftIn = Arrays.copyOfRange(inOrder, 0, i);
		
		//������������ǰ�����������
		Object[] rightPre = Arrays.copyOfRange(preOrder, i + 1, preOrder.length);
		Object[] rightIn = Arrays.copyOfRange(inOrder, i + 1, inOrder.length);
		
		//�ݹ鹹����ǰ���ڵ��������
		root.left = reBuildBinaryTree(leftPre, leftIn);
		
		//�ݹ鹹����ǰ���ڵ��������
		root.right = reBuildBinaryTree(rightPre, rightIn);
		
		//�ݹ鹹�����������, ���ظ��ڵ�
		return root;
	}
}
