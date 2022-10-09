package BinarySearchProblems;

public class FindTheCeiling {

	public static void main(String[] args) {

		
		int[] arr = {2, 3, 5, 9, 14, 16, 23, 33, 40};
		int target = 17;
		int ans = ceiling(arr, target);
		System.out.println(arr[ans]);
		
	}
	
	
	static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid+1;
            }
        }
        
        // when start=end condition is met in while loop, in the following iteration our start will get updated to mid+1.
        // and that will be our answer which we return below :- 
        return start;
    }

}
