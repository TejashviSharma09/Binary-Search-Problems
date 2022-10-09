package BinarySearchProblems;

public class BinarySearchImplementation {

	public static void main(String[] args) {

		int[] nums = {-4, 1, 3, 44, 56, 77};
		int target = 3;
		System.out.println(binarySearch(nums, target));
		
	}
	
	static int binarySearch(int[] arr, int target) {
		if(arr.length == 0) 
			return -1;
		
		int start = 0;
		int end = arr.length - 1;
		
		// 2 pointer approach using while loop
		while(start <= end) {
			
			// find the middle element
//          int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			
			int mid = start + (end - start) / 2;	// ALWAYS FIND 'MIDDLE value' THIS WAY.
			if(target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
			
		}
		return -1;
	}

}
