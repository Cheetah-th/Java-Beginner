import java.util.Scanner;
public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x => ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			int j = 1;
			int count = 0;
			String n;

			while (j <= i) {
				if (i % j == 0) {
					count++;
				}
				j++;
			}

			if (count == 2) {
				n = "is prime";
			}
			else {
				n = "isn't prime";
			}
			
			System.out.println (i + " " + n);
		}

	}

}
