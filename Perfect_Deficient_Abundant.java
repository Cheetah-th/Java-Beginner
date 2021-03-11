import java.util.Scanner;
public class Perfect_Deficient_Abundant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n => ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n) {
			System.out.println ("This number's Perfect Number");
		}
			else if (sum < n) {
					System.out.println ("This number's Deficient Number");
			}
				else {
					System.out.println ("This number's Abundant Number");
				}

	}

}
