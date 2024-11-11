package array.intervals;

import java.util.ArrayList;

public class MergeNewInterval {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

		// [1,3],[6,9] == [2,5]
		// [1,5] [6,9]

		ArrayList<Interval> ans = new ArrayList<>();
		int nStart = newInterval.start;
		int nEnd = newInterval.end;

		for (int i = 0; i < intervals.size(); i++) {

			int left = intervals.get(i).start;
			int right = intervals.get(i).end;

			if (nStart > right) {

				Interval temp = new Interval(left, right);
				ans.add(temp);

			} else if (left > nEnd) {

				Interval temp = new Interval(nStart, nEnd);
				ans.add(temp);

				for (int j = i; j < intervals.size(); j++) {

					Interval temp1 = new Interval(intervals.get(j).start, intervals.get(j).end);
					ans.add(temp1);

				}
				return ans;

			} else {

				nStart = Math.min(nStart, left);
				nEnd = Math.max(nEnd, right);

			}

		}
		Interval temp = new Interval(nStart, nEnd);
		ans.add(temp);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeNewInterval m = new MergeNewInterval();

		Interval temp1 = new Interval(1, 3);
		Interval temp2 = new Interval(6, 9);
//		Interval temp3 = new Interval(8, 10);
//		Interval temp4 = new Interval(15, 18);

		ArrayList<Interval> input = new ArrayList<>();
		input.add(temp1);
		input.add(temp2);
//		input.add(temp3);
//		input.add(temp4);

		ArrayList<Interval> ans = m.insert(input, new Interval(2, 5));
		for (Interval i : ans) {
			System.out.print("[" + i.start + "," + i.end + "] ");
		}

	}

}
