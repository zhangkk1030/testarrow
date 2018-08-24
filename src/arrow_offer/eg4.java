package arrow_offer;


public class eg4 {
//输入某二叉树的前序遍历和中序遍历结果，重建出该二叉树
	/*
	 * 前序遍历：根左右		中序遍历：左根右
	 * TreeNode *left
	 * TreeNode *right
	 * */
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
		return root;
	}
	//前序遍历{1,2,4,7,3,5,6,8}
	//中序遍历{4,7,2,1,5,3,8,6}

private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
	if(startPre>endPre||startIn>endIn)	//binaryTree不为空
		return null;
	TreeNode root = new TreeNode(pre[startPre]);

	for (int i = startIn; i < endIn; i++) {
		if(in[i]==pre[startPre]) {
			root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
			root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
			break;
		}
	}
	return root;
}

}
