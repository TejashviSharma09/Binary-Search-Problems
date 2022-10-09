package BinarySearchProblems;

public class FindTheFloor {

	public static void main(String[] args) {

		// Sorted Array
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 7;
		int ans = floor(arr, target);
		System.out.println(arr[ans]);
		
	}
	
	// return index of the greatest no. <= target
	static int floor(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		if(target > arr[end]) {
			return -1;
		}
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid - 1;
			}
		}
		return end;
		
	}

}
