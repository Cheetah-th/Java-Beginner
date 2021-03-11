import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Friend5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String fname;
		String lname;
		String tel;
		String address;
		int zipcode;

		DataInputStream fileIn = new DataInputStream(new FileInputStream("FriendZone.dat"));
		try {
			while(true) {
				fname = fileIn.readUTF();
				lname = fileIn.readUTF();
				tel = fileIn.readUTF();
				address = fileIn.readUTF();
				zipcode = fileIn.readInt();
			
				System.out.printf("%10s %10s %12s %30s %8d %n", formText(fname, 10), formText(lname, 10), formText(tel, 15), formText(address, 30), zipcode);

			}
		}
		catch (EOFException e) {
			System.out.println("\n" + "End of File");
		}
	
	}
	
	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}
	
}
