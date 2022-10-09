package BinarySearchProblems;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {

	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastIndex(nums, target)));
		
		
	}
	
	static int[] findFirstAndLastIndex(int[] nums, int target) {
		
		// Initializing 1st and Last Indexes.
		int[] ans = {-1, -1};
		// Finding 1st Index
		ans[0] = binarySearch(nums, target, true);
		if(ans[0] != -1) {
			// Finding Last Index ONLY IF 1st Index is non-negative.
			ans[1] = binarySearch(nums, target, false);
		}
		
		// log(n) + log(n) = 2log(n) ==> log(n) time complexity
		return ans;
	}
	
	static int binarySearch(int[] nums, int target, boolean findFirstIndex) {
		
		// Index
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(target < nums[mid]) {
				end = mid - 1;
			} else if(target > nums[mid]) {
				start = mid + 1;
			} else {
				// Might be the answer
				ans = mid;
				if(findFirstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
		
	}

}
