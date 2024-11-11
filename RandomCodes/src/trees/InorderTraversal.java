package trees;

import java.util.ArrayList;

public class InorderTraversal {

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
	
	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		if (A==null) {
			return ans;
		}else {
			return inorderTraversal1(A,ans);
		}
		
	}

	

	public ArrayList<Integer> inorderTraversal1(TreeNode A,ArrayList<Integer> ans) {

		if (A == null) {
			return ans;
		}

		inorderTraversal1(A.left,ans);
		ans.add(A.val);

		inorderTraversal1(A.right,ans);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
