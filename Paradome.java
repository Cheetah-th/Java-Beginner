import java.util.Scanner;
public class Paradome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number => ");
		int n = sc.nextInt();
		int ans = 0, digit, a;
		a = n;
		
		for (;n != 0;) {
			digit = n % 10;
			ans = ans * 10 + digit;
			n = n / 10;
		}	
		
		System.out.println("Number = " + a);
		System.out.println("Ans = " + ans);
		
		if (ans == a)
			System.out.println("Yes, it's Paradome");
		else System.out.println("No, it isn't Paradome");
	}

}
