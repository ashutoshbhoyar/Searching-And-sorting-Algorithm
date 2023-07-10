package Algorithm_Examples;

public class Linear_Search {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 9, 5, 3, 8, 0 };
		int target = 5;

		int index = linearSearch(arr, target);

		if (index == -1) {

			System.out.println(target + " at index = " + index);
		} else {
			System.out.println("target not fount");
		}
	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
