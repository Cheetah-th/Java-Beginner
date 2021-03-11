import java.util.Scanner;
public class GCD_LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x => ");
		int x = sc.nextInt();
		System.out.print("Enter y => ");
		int y = sc.nextInt();
		int p = x;
		int q = y;
		int t;

		while (q != 0) {
			t = q;
			q = p % q;
			p = t;
		}

		int gcd = p;
		int lcm = (x * y) / gcd;

		System.out.println ("GCD is " + gcd);
		System.out.println ("LCM is " + lcm);

	}

}
