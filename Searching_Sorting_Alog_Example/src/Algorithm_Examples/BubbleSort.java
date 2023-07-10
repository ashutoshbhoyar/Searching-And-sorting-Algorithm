package Algorithm_Examples;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 7, 9, 3, 1, 8, 5, 3, 4, 0 };

		// for ascending
		
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (Integer i : arr) {
			System.out.print(i);
		}

		// for descending
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (Integer i : arr) {
			System.out.print(i);
		}
	}
}