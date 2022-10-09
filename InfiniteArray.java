package BinarySearchProblems;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

// NOTE ---> As mentioned it's an infinite array, therefore, we must not use arr.length property

public class InfiniteArray {

	public static void main(String[] args) {

		int[] nums = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
		int target = 130;
		
		System.out.println(searchInfiniteArray(nums, target));
		
		
	}
	
	static int searchInfiniteArray(int[] nums, int target) {
		
		// First find the range
		// Let's start with a Box/Chunk Size of 2. Then keep doubling.
		int start = 0;
		int end = 1;
		
		// If target lies outside the Box/Chunk then calculate the new 'start' and 'end' pointer by doubling the Box Size.
		while(target > nums[end]) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2;
			start = newStart;
		}
		return binarySearchInRange(nums, target, start, end);
		
	}
	
	static int binarySearchInRange(int[] nums, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < nums[mid]) {
				end = mid - 1;
			} else if(target > nums[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		// Answer not found
		return -1;
	}

}
