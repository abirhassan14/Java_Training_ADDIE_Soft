package CollectionUtility;

public class BinarySearching1 {

	public static void main(String[] args) {
		
		int[] arr = {1,5,4,10,20,30,56};
		int target = 56;
		
		int result = BinarySearch(arr,target);
		
		if (result == -1) {
			System.out.println("The element not found in the array");
		}else {
			System.out.println("The element is: " +result);
		}

	}

	
	private static int BinarySearch(int[] arr, int searchvalue) {
		int start = 0;
		int end = arr.length-1;
		
		while (start<=end) {
			int mid = (start+end)/2;
			if(searchvalue > arr[mid]) {
				start = mid+1;
			}else if(searchvalue < arr[mid]){
				end = mid-1;
			}else {
				return arr[mid]; // //This will give the actual number of the target element
				//return mid; //This will give the index number of the target element
			}	
		}
		
	
		return -1;
	}
}
