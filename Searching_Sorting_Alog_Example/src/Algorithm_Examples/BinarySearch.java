package Algorithm_Examples;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = new int[100000];
		int target = 3;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int index = binarySearch(arr, target);

		if (index == -1) {

			System.out.println(target + " at index = " + index);
		} else {
			System.out.println("target not fount");
		}

	}

	private static int binarySearch(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2;

			int value = arr[middle];

			System.out.println(value);

			if (value < target) {
				low = middle + 1;
			} else if (value > target) {
				high = middle - 1;
			} else
				return middle;
		}

		return -1;
	}
}