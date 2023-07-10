package Algorithm_Examples;

public class InterpolationSearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

		int index = interploationSearch(arr, 256);

		if (index == -1) {

			System.out.println("Element at index = " + index);
		} else {
			System.out.println("element not fount");
		}
	}

	private static int interploationSearch(int[] arr, int value) {
		int high = arr.length - 1;
		int low = 0;
		while (value >= arr[low] && value <= arr[high] && low <= high) {
			int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);

			System.out.println("probe : " + probe);

			if (arr[probe] == value) {
				return probe;
			} else if (arr[probe] < value) {
				low = probe + 1;
			} else {
				high = probe - 1;
			}
		}
		return -1;
	}
}
