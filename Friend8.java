import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Friend8 {
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
						WriteLetter(fname, lname, tel, address, zipcode);
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
	
	public static void WriteLetter(String fname, String lname, String tel, String address, int zipcode) throws IOException {
		DataInputStream fileIn = new DataInputStream(new FileInputStream("FriendZone.dat"));
		String line;
		String letter;
		Scanner letterIn = new Scanner(new FileReader("TheLetter.dat"));
				System.out.println("-----Letter to " + fname + " " + lname + " -----");
				while (letterIn.hasNext()) {
					line = letterIn.nextLine();
					letter = line;
					if (line.equals("Dear %")) {
						letter = line.replace("%", fname + " " + lname);
					}
					if (line.equals("%")) {
						letter = line.replace("%", fname + " " + lname);
					}
					if (line.equals("@")) {
						letter = line.replace("@", tel);
					}
					if (line.equals("$")) {
						letter = line.replace("$", address);
					}
					if (line.equals("#")) {
						letter = line.replace("#", Integer.toString(zipcode));
					}
					System.out.println(letter);
				}
				System.out.println("---------------------------\n");

	}
	
	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}

}
