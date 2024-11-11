package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FinishMaximumJobs {

	class Pair {
		int sTime;
		int eTime;

		Pair(int sTime, int eTime) {
			this.sTime = sTime;
			this.eTime = eTime;
		}
	}

	public int solve(int[] A, int[] B) {

		List<Pair> jobs = new ArrayList<>();

		for (int i = 0; i < B.length; i++) {

			jobs.add(new Pair(A[i], B[i]));

		}

		Collections.sort(jobs, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				if (p1.eTime == p2.eTime) {
					return Integer.compare(p2.sTime, p1.sTime);
				}
				return Integer.compare(p1.eTime, p2.eTime);
			}
		});

		int jCount = 1;
		int lastEndTime = jobs.get(0).eTime;

		for (int i = 1; i < jobs.size(); i++) {

			if (jobs.get(i).sTime >= lastEndTime) {
				jCount++;
				lastEndTime = jobs.get(i).eTime;
			}

		}

		return jCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinishMaximumJobs f = new FinishMaximumJobs();
		System.out.println(f.solve(new int[] { 1, 5, 7, 1 }, new int[] { 7, 8, 8, 8 }));
		System.out.println(f.solve(new int[] { 3, 2, 6 }, new int[] { 9, 8, 9 }));

	}

}
