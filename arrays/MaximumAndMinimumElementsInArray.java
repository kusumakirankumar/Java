package arrays;

public class MaximumAndMinimumElementsInArray {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 1, 2, 3, 4, 5, 6, 7 };
		int min = arr[0];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
