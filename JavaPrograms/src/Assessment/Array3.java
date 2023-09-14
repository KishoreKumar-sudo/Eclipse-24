//Example 1:
//Input: N = 5, arr[] = {5,4,3,2,1}
//Output: {1,2,3,4,5}
//Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
//
//Example 2:
//Input: N=6 arr[] = {10,20,30,40}
//Output: {40,30,20,10}
//Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

package Assessment;

import java.util.Arrays;

public class Array3 {
	//Function to print array
	static void printArray(int ans[], int n) {
		System.out.println("Reversed Array is: \n");
		for (int i=0; i<n; i++) {
			System.out.println(ans[i]+" ");
		}
	}
	
	//Function to reverse array using an auxiliary array
	static void reverseArray(int arr[], int n) {
		int[] ans =new int[n];
		for (int i=n-1; i>=0; i--) {
			ans[n- i- 1] =arr[i];
		}
		printArray(ans, n);
	}
	public static void main(String[] args) {
		int n=5;
		int arr[]= {5,4,3,2,1};
		reverseArray(arr,n);
	}
}
