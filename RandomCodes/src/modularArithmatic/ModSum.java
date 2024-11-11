package modularArithmatic;

import java.util.ArrayList;

public class ModSum {

	public int solve(ArrayList<Integer> A) {

		int mod = 1000000007;
		int[] freq = new int[1001];
		for (int i = 0; i < A.size(); i++) {
			freq[A.get(i)]++;
		}
		int ans = 0;
		for (int i = 1; i < 1001; i++) {
			for (int j = 1; j < 1001; j++) {
				int val = i % j;
				int temp = val * freq[i] * freq[j];
				ans = (ans + temp) % mod;
				ans = ans % mod;
			}
		}
		return ans % mod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModSum m = new ModSum();
		m.solve(null);

	}

}
