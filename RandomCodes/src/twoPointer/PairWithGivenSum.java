package twoPointer;

import java.util.ArrayList;

public class PairWithGivenSum {

	public int solve(ArrayList<Integer> A, int B) {

		int l = 0, r = A.size() - 1;

        long ans = 0, mod = 1000000007;

        while (l < r) {

            int sum = A.get(l) + A.get(r);

            if (sum == B) {

                if (A.get(l).equals(A.get(r))) {

                    long elements = r - l + 1;

                    ans = (ans + (elements * (elements - 1) / 2) % mod) % mod;

                    break;

                }

                int leftElementCount = findFrq(l, A, 'l', A.get(l));

                int rightElementCount = findFrq(r, A, 'r', A.get(r));

                ans = (ans + (1L * leftElementCount * rightElementCount) % mod) % mod;

                l += leftElementCount;

                r -= rightElementCount;

            } else if (sum < B) {

                l++;

            } else {

                r--;

            }

        }

        return (int) ans;
	}

	public int findFrq(int idx, ArrayList<Integer> A, char dir, int k) {

        int frq = 0;

        if (dir == 'l') {

            while (idx < A.size() && A.get(idx) == k) {

                frq++;

                idx++;

            }

        } else {

            while (idx >= 0 && A.get(idx) == k) {

                frq++;

                idx--;

            }

        }

        return frq;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairWithGivenSum p = new PairWithGivenSum();

		ArrayList<Integer> A = new ArrayList<>();
		
		A.add(1);
		A.add(1);
		A.add(1);
		
//		A.add(1);
//		A.add(5);
//		A.add(7);
//		A.add(10);

		System.out.println(p.solve(A, 2));
//		System.out.println(p.solve(A, 8));

	}

}
