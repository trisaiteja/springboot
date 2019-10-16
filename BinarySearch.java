public class BinarySearch {

	public static int binarySearch(int[] a, int key, int lb, int ub) {
		int mid = 0;
		while (lb <= ub) {
			mid = (lb + ub) / 2;
			if (key == a[mid]) {
				return mid;
			}
			if (key < a[mid]) {
				ub = mid - 1;
			}
			if (key > a[mid]) {
				lb = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 10, 12, 35, 67, 78, 90 };
		int key = 12;
		int result = binarySearch(a, key, 0, a.length - 1);
		System.out
				.println(result == -1 ? "Key not found in the given array." : "Key found at " + result + "th location");
	}

}
