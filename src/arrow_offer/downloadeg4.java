package arrow_offer;

import java.util.Arrays;

public class downloadeg4 {
	/**
	 * 根据前序和中序遍历数组重构二叉树
	 * @param preOrder:前序遍历数组
	 * @param inOrder:中序遍历数组
	 * @return root:二叉树
	 */
	static BinaryTree reBuildBinaryTree(Object[] preOrder,Object[] inOrder){

		//递归退出条件
		if (preOrder == null || inOrder == null || preOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		// 前序遍历的结果的第一个元素即为二叉树的根节点
		BinaryTree root=new BinaryTree(preOrder[0]);
		
		//根节点在中序遍历中的索引
		int i=0;
		// 获取根节点在中序遍历中的索引
		for (;i < inOrder.length;i++) {
			if (inOrder[i] == preOrder[0]) {
				break;
			}
		}
		
		//构造左子树的前序和中序数组
		Object[] leftPre = Arrays.copyOfRange(preOrder, 1, i + 1);
		Object[] leftIn = Arrays.copyOfRange(inOrder, 0, i);
		
		//构造右子树的前序和中序数组
		Object[] rightPre = Arrays.copyOfRange(preOrder, i + 1, preOrder.length);
		Object[] rightIn = Arrays.copyOfRange(inOrder, i + 1, inOrder.length);
		
		//递归构建当前根节点的左子树
		root.left = reBuildBinaryTree(leftPre, leftIn);
		
		//递归构建当前根节点的右子树
		root.right = reBuildBinaryTree(rightPre, rightIn);
		
		//递归构建二叉树完成, 返回根节点
		return root;
	}
}
