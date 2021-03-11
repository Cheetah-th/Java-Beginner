import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Friend7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
			DataInputStream fileIn = new DataInputStream(new FileInputStream("FriendZone.dat"));
			String fname, lname, tel, address;
			int zipcode;
			String line;
			String letter;
			Scanner letterIn = new Scanner(new FileReader("TheLetter.dat"));
			try {
				while (true) {
					fname = fileIn.readUTF();
					lname = fileIn.readUTF();
					tel = fileIn.readUTF();
					address = fileIn.readUTF();
					zipcode = fileIn.readInt();
					letterIn = new Scanner(new FileReader("TheLetter.dat"));
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
			} catch (EOFException e) {
				System.out.println("End of file");
			}

	}

}
