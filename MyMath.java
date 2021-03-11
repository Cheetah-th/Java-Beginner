import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double x = sc.nextDouble();
		System.out.println(Fact(n));
		System.out.println(Pow(5.0, 3));

	}

	public static int Fact(Double n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static int Pow(Double x, int y) {
		int pow = 1;
		for (int i = 1; i <= y; i++) {
			pow *= x;
		}
		return pow;
	}

	public static int Square(int x, int y) {
		int sq = 1;
		sq = x * y;
		return sq;
	}

}
