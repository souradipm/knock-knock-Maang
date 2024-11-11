package trees;

import java.util.ArrayList;

public class PreorderTraversal {

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

	ArrayList<Integer> ans = new ArrayList<>();

	public ArrayList<Integer> preorderTraversal(TreeNode A) {

		if (A == null) {
			return ans;
		}

		ans.add(A.val);
		preorderTraversal(A.left);
		preorderTraversal(A.right);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
