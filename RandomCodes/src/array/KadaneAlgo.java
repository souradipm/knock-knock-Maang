package array;

public class KadaneAlgo {

	public int getMax(int[] arr) {

		int maxV = Integer.MIN_VALUE;
		int currMax = 0;

		for (int n : arr) {

			currMax += n;
			maxV = Math.max(maxV, currMax);

			if (currMax < 0) {
				currMax = 0;
			}

		}

		return maxV;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KadaneAlgo k = new KadaneAlgo();
		System.out.println(k.getMax(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

	}

}
