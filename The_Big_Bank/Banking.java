package The_Big_Bank;

public class Banking {
	private double balance;

	public void deposit(int d) {
		balance += d;
	}

	public void Withdraw(int w) {

		if (w > balance) {
			System.out.println("Your Balance not enough to with draw");
		} // change to pop up
		else
			balance -= w;
	}

	public double getBalance() {
		return balance;
	}

}
