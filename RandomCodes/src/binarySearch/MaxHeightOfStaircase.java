package binarySearch;

public class MaxHeightOfStaircase {
	
	public int solve(int A) {
        int height = A>0?1:0;
        int i=1;
        while(i*(i+1) <= 2*A){
            height=i;
            i++;
        }
        return height;
    }

	public int solve1(int A) {

		int count = 1;
		int blocksUsed = 0;
		int maxHeight = Integer.MIN_VALUE;
		if (A <= 0) {
			return 0;
		} else {

			while (blocksUsed <= A) {

				blocksUsed += count;

				if (blocksUsed > A) {
					return maxHeight;
				}

				maxHeight = Math.max(count, maxHeight);
				count++;

			}

		}

		return maxHeight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeightOfStaircase m = new MaxHeightOfStaircase();
		System.out.println(m.solve(10));

	}

}
