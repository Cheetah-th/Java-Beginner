import java.util.Scanner;

public class FactPow2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = -1;
		double up, down, sum;
		for (double i = 4; i <= n; i++) {
			up = MyMath.Fact(i);
			down = MyMath.Pow(i, 3);
			sum = up / down;
			if (i % 2 != 0) {
				sum = sum * -1;
			}
			// System.out.println(sum);
			ans += sum;

		}
		System.out.println(ans);
	}

}
