package CollectionUtility;


public class LinearSearchExample {

	public static void main(String[] args) {
		
		int[] a = {1,5,4,10,20,30,8};
		int target = 11;
		
		int result = LinearSearch(a,target);
		
		if (result == -1) {
			System.out.println("No element found");
		}else {
			System.out.println("The element: " +result);
		}
	}
	
	
	
	/* here we are using static because that's why we dont need to create any object 
	   of that class */
	public static int LinearSearch(int[] arr, int tar) {
		for(int i=0; i<arr.length; i++) { // Always use "<" for .length function. do no use "<="
			if(arr[i] == tar) {
				return arr[i];
			}
		}
		return -1; 
		/* This return type is default. There is never can be a -1 index. That is why
		We put the index -1. So, if the value is not found then it will return -1 index
		which is invalid */
	}
}

