package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedParanthesis {

	public int solve(String A) {

		Stack<Character> st = new Stack<>();
		int top = -1;

		List<Character> open = new ArrayList<>();
		List<Character> close = new ArrayList<>();

		open.add('(');
		open.add('{');
		open.add('[');

		close.add(')');
		close.add('}');
		close.add(']');

		for (int i = 0; i < A.length(); i++) {

			if (open.contains(A.charAt(i))) {

				st.push(A.charAt(i));
				top++;

			} else if (close.contains(A.charAt(i))) {
				
				if(top<0) {
					return 0;
				}

				if ((A.charAt(i) == ')' && st.get(top) == '(') || (A.charAt(i) == '}' && st.get(top) == '{')
						|| (A.charAt(i) == ']' && st.get(top) == '[')) {
					st.pop();
					top--;
				}else {
					return 0;
				}

			}

		}

		if(st.size()==0) {
			return 1;
		}else {
		return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedParanthesis b = new BalancedParanthesis();
		System.out.println(b.solve("))))))))"));

	}

}
