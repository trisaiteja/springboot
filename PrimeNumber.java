import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}

		if (count > 0) {
			System.out.println("Given number is not prime number.");
		} else {
			System.out.println("Given number is a prime number.");
		}
	}
}
