import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n => ");
		int n = sc.nextInt();
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("This number isn't prime");
				return;
			}
		}
		
		System.out.println("This number's prime");

	}

}
