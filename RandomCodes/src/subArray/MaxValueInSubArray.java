package subArray;

public class MaxValueInSubArray {
	
	public void maxAbs(int[] arr){
        int result=0;
        int temp;
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            int count_1 = 0;
            int count_0 = 0;
            if(arr[i] == 1)
                count_1 = count_1 + 1;
            else
                count_0 = count_0 + 1;
            for(int j=i+1; j<n;j++){
                if(arr[j] == 1)
                    count_1 = count_1 + 1;
                else
                    count_0 = count_0 + 1;
                temp = Math.abs(count_0 - count_1);
                if(temp > result)
                    result = temp;
            }
        }
        System.out.println(result);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxValueInSubArray m = new MaxValueInSubArray();
//		int[] arr = {0,1,1,1,1,1,0};
		int[] arr = {0,1,1,0,1,1,0};
        m.maxAbs(arr);

	}

}
