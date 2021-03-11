import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Friend1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		PrintWriter xx = new PrintWriter("FriendZone.txt");
		String fname;
		String lname;
		String tel;
		String Address;
		int zipcode;
		while (true) {
			System.out.print("Enter First Name or Enter -1 to Stop : ");
			fname = sc.next();
			if ((fname).compareTo("-1") == 0) {
				break;
			}
			System.out.print("Enter Last Name : ");
			lname = sc.next();
			System.out.print("Enter Tel : ");
			tel = sc.next();
			System.out.print("Enter Address : ");
			Address = sc.next();
			System.out.print("Enter Zipcode : ");
			zipcode = sc.nextInt();
			xx.printf("%10s %10s %12s %30s %8d %n", formText(fname, 10), formText(lname, 10), formText(tel, 15), formText(Address, 30), zipcode);
		}
		xx.close();

	}
	
	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}

}
