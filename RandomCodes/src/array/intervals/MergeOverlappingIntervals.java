package array.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// * Definition for an interval.
class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MergeOverlappingIntervals {

	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

		Collections.sort(intervals, (a, b) -> {
			return a.start - b.start;
		});

		ArrayList<Interval> ans = new ArrayList<>();
		int cStart = intervals.get(0).start;
		int cEnd = intervals.get(0).end;

		for (int i = 1; i < intervals.size(); i++) {

			if (intervals.get(i).start <= cEnd) {

				cEnd = Math.max(intervals.get(i).end, cEnd);

			} else {

				Interval temp = new Interval(cStart, cEnd);
				ans.add(temp);

				cStart = intervals.get(i).start;
				cEnd = intervals.get(i).end;

			}

		}

		Interval temp = new Interval(cStart, cEnd);
		ans.add(temp);

		return ans;

	}

	public int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		int cStart = intervals[0][0];
		int cEnd = intervals[0][1];

		List<int[]> list = new ArrayList<>();

		for (int i = 1; i < intervals.length; i++) {

			if (intervals[i][0] <= cEnd) {
				cEnd = Math.max(cEnd, intervals[i][1]);
			} else {
				int arr[] = new int[] { cStart, cEnd };
				list.add(arr);
				
				cStart =intervals[i][0];
				cEnd = intervals[i][1];

			}

		}

		int arr[] = new int[] { cStart, cEnd };
		list.add(arr);

		return list.toArray(new int[list.size()][]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeOverlappingIntervals m = new MergeOverlappingIntervals();

//		Interval temp1 = new Interval(1, 3);
//		Interval temp2 = new Interval(2, 6);
//		Interval temp3 = new Interval(8, 10);
//		Interval temp4 = new Interval(15, 18);
//
//		ArrayList<Interval> input = new ArrayList<>();
//		input.add(temp1);
//		input.add(temp2);
//		input.add(temp3);
//		input.add(temp4);
//
//		ArrayList<Interval> ans = m.merge(input);
//		for (Interval i : ans) {
//			System.out.print("[" + i.start + "," + i.end + "] ");
//		}
		
		int arr[][] = m.merge(new int[][] {{1,2},{3,5},{4,7},{6,8},{9,10}});
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
			
		}
		

	}

}
