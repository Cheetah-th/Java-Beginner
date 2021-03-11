import java.util.Scanner;

public class FactPow1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double up, down;
		double ans = 0;
		double sum = 0;

		for (double i = 1; i <= n; i++) {
			up = MyMath.Fact(i);
			down = MyMath.Pow(i, 2);
			sum = up / down;
			ans += sum;
		}
		System.out.println(ans);
	}

}
