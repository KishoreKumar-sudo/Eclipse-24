//Example 1:
//Input: arr[] = {2,5,1,3,0};
//Output: 0
//Explanation: 0 is the largest element in the array. 
//
//Example2: 
//Input: arr[] = {8,10,5,7,9};
//Output: 5
//Explanation: 5 is the largest element in the array.


package Assessment;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// Sort the array in Ascending order
		int arr1[]= {2,5,1,3,0};
		System.out.println("The largest element in array is: " + sort(arr1));
		
		int arr2[]= {8,10,5,7,9};
		System.out.println("The largest element in array is: " + sort(arr2));
	}

	 static int sort(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length -1];
	}

}
