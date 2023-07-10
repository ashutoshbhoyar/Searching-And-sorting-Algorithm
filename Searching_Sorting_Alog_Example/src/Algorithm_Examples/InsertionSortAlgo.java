package Algorithm_Examples;

public class InsertionSortAlgo {
	public static void main(String[] args) {

		int arr[] = { 5, 7, 6, 8, 9, 4, 1, 3, 0, 2 };

		InsertionSort(arr);

		for (int i : arr) {
			System.out.print(i);
		}

	}

	private static void InsertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

	}

}
