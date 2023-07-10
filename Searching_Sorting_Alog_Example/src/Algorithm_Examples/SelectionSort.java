package Algorithm_Examples;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 6, 3, 1, 8, 9, 0, 2, 4 ,7};

		SelectionSortMeth(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static void SelectionSortMeth(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

	}

}
