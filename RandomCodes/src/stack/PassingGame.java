package stack;

import java.util.ArrayList;
import java.util.Stack;

public class PassingGame {

	public int solve(int A, int B, ArrayList<Integer> C) {

		Stack<Integer> st = new Stack<>();
		st.push(B);

		for (Integer c : C) {

			if (c == 0) {

				st.pop();

			} else {

				st.push(c);

			}

		}

		return st.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> C = new ArrayList<>();
		C.add(86);
		C.add(63);
		C.add(60);
		C.add(0);
		C.add(47);
		C.add(0);
		C.add(99);
		C.add(9);
		C.add(0);
		C.add(0);

		PassingGame p = new PassingGame();
		System.out.println(p.solve(10, 23, C));

	}

}
