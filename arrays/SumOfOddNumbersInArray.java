package arrays;

public class SumOfOddNumbersInArray {
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		// Iterating the array
		for (int i = 0; i < arr.length; i++) {
			// Finding odd elements
			if (arr[i] % 2 == 1) {
				// If element found summing them
				sum += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\nSum is: " + sum);
	}
}
