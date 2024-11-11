package array;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
	public int[] solve(int[] A) {

		int len = A.length;
		List<Integer> list = new ArrayList<>();
		list.add(A[len - 1]);
		int max = A[len - 1];
		for (int i = len - 2; i >= 0; i--) {

			if (A[i] > max) {
				list.add(A[i]);
				max = A[i];
			}

		}

		int arr[] = new int[list.size()];
		int k = 0;
		for (int l : list) {
			arr[k++] = l;
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaderInArray ll = new LeaderInArray();
		int arr[] = ll.solve(new int[] { 16, 17, 4, 3, 5, 2 });
		for (int l : arr) {
			System.out.println(l);
		}

	}

}
