public class LinearSearch {

	public static int linearSearch(int[] a, int key, int lb, int ub) {
		while (lb <= ub) {
			if (key == a[lb]) {
				return lb;
			}
			lb++;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 10, 4, 6, 3, 8, 1 };
		int key = 3;
		int result = linearSearch(a, key, 0, a.length - 1);
		System.out.println(
				(result == -1 ? "Key not found in the given array." : "Key found at " + result + "th location"));
	}

}
