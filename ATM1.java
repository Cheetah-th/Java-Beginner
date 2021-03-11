import java.util.Scanner;

public class ATM1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM_TEST x = new ATM_TEST();
		int ans = 0;
		int n = 0;
		while (true) {
			System.out.println(" 1. Deposit");
			System.out.println(" 2. Withdraw");
			System.out.println(" 3. Balance");
			System.out.println(" 4. End The Process");
			System.out.print("=> ");
			ans = sc.nextInt();

			switch (ans) {
			case 1:
				System.out.print("Enter Your Money : ");
				n = sc.nextInt();
				x.deposit(n);
				System.out.println();
				break;
			case 2:
				System.out.print("Enter Your Withdraw Money : ");
				n = sc.nextInt();
				x.withdraw(n);
				System.out.println();
				break;
			case 3:
				System.out.println("Your Balance Money : " + x.getBalance());
				System.out.println();
				break;
			case 4:
				System.out.println("End");
				return;
			}
		}

	}

}

class ATM_TEST {
	Scanner sc = new Scanner(System.in);
	private int balance;

	public void deposit(int n) {

		balance += n;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int n) {
		int c = check(n);
		if (c == 0) {
			balance -= n;
			banking(n);
		} else if (c == -1) {
			System.out.println("Your balance don't enough to withdraw");
		} else {
			System.out.println("This ATM don't have coin for you");
		}
	}

	public int check(int w) {
		if (balance < w) {
			return -1;
		} else if (w % 100 == 0) {
			return 0;
		} else {
			return -2;
		}
	}

	public void banking(int w) {
		int keep = w;
		int b1000 = 0, b500 = 0, b100 = 0;
		if (w >= 1000) {
			b1000 = keep / 1000;
			keep = keep % 1000;
		}
		if (w >= 500) {
			b500 = keep / 500;
			keep = keep % 500;
		}
		if (w >= 100) {
			b100 = keep / 100;
			keep = keep % 100;
		}
		System.out.println("Bank 1000 : " + b1000 + "\nBank 500 : " + b500 + "\nBank 100 : " + b100);

	}

}
