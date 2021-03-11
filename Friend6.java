import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Friend6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
			DataInputStream fileIn = new DataInputStream(new FileInputStream("FriendZone.dat"));
			String fname, lname, tel, address;
			int zipcode;
			int x = 0;   // To check if NotFound
			
			try {
				System.out.print("Enter Name to Find : ");
				String find = sc.next();
				while (true) {
					fname = fileIn.readUTF();
					lname = fileIn.readUTF();
					tel = fileIn.readUTF();
					address = fileIn.readUTF();
					zipcode = fileIn.readInt();
					if (find.compareTo(fname) == 0) {
						System.out.printf("%10s %10s %12s %30s %8d %n%n", formText(fname, 10), formText(lname, 10), formText(tel, 15), formText(address, 30), zipcode);
						x++;
					}
				}
			} 
			catch (EOFException e) {
				System.out.println("End of file");
			}
			if (x == 0) {
				System.out.println("\n" + "This Name isn't Found");
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
