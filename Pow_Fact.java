import java.util.Scanner;
public class Pow_Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n => ");
		double n = sc.nextDouble();
		double x, pow, fact,sum;
		pow = 1;
		fact = 1;
		sum = 0;
		
		for (int i = 1; i <= n; i++) {
			pow = pow * 2;
			fact = fact * i;
			sum = pow / fact + sum;
		}

		System.out.println(pow);
		System.out.println(fact);
		System.out.println(sum + 1);
	}

}
