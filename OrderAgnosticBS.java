package BinarySearchProblems;

public class OrderAgnosticBS {

	public static void main(String[] args) {

//		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};	// ASC
		int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};	// DESC
		int target = 11;
		
		System.out.println(orderAgnosticBS(arr, target));
		
	}
	
	static int orderAgnosticBS(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		// Find out the order in which elements are arranged in the Array
		// Ascending -> If 1st element > last element
		// Descending -> If 1st element < last element
		boolean isAsc = arr[start] < arr[end];
		
		// 2 pointer approach using while loop
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(target == arr[mid])
				return mid;
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if(target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

}