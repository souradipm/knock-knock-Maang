package trees;

import java.util.ArrayList;

public class BinaryTreeFromInorderAndPostorder {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}

	public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

		return buildTreeImpl(A,0,A.size()-1, B,0,B.size()-1);
	}

	public TreeNode buildTreeImpl(ArrayList<Integer> A, int inL, int inR, ArrayList<Integer> B, int poL, int poR) {

		if(inL > inR) {
			return null;
		}
		
		int rootVal = B.get(poR);
		
		TreeNode root = new TreeNode(rootVal);
		
		int rootIdx = A.indexOf(rootVal);
		
		int lCount = ((rootIdx-1) - inL +1);
		int postOrderLeftSubtreeEnd = poL+lCount-1;
		
		root.left = buildTreeImpl(A,inL,rootIdx-1, B,poL,postOrderLeftSubtreeEnd);
		
		root.right = buildTreeImpl(A,rootIdx+1,inR, B,postOrderLeftSubtreeEnd+1,poR-1);
		
		
		
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
