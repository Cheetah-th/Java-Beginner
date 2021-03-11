import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n => ");

		int p = sc.nextInt();
		for (double n = 0; n <= p; n++) {
			for (double i = n; i <= p; i++) {
				System.out.print(" ");
			}
			for (double r = 0; r <= n; r++) {
				double x = MyMath.Fact(n) / (MyMath.Fact(n - r) * MyMath.Fact(r));
				System.out.print((int) x + " ");
			}
			System.out.println();
		}
	}

}
