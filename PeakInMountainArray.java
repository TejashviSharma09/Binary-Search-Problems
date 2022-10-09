package BinarySearchProblems;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/

public class PeakInMountainArray {

	public static void main(String[] args) {

		
		int[] nums = {0,7,8,10,5,2};
		int peakIndexMountainArray = findPeakIndex(nums);
		System.out.println(peakIndexMountainArray);
		
	}
	
	static int findPeakIndex(int[] nums) {
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end) {
			
			int mid = start + (end - start) / 2;
			
			if(nums[mid] < nums[mid+1]) {
				// we are in asc part of array
				start = mid + 1;
			} else {
				// we are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
				end = mid;
			}
			
		}
		
		// After the loop is done executing, start and end would point at the peak index coz of the 2 check made in loop
		return start;
//		return end;
	}

}
