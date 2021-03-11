package The_Big_Bank;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Acount {

	public Acount(String n) throws IOException {
		String name = "Acount" + n;
		Scanner fileIn = new Scanner(new FileReader("Acount berk kak.txt"));
		String id = fileIn.next();
		String na = fileIn.nextLine();
		String random = fileIn.nextLine();
		String balance = " ";
		while (fileIn.hasNext()) {
			balance = fileIn.next();
		}
		int b = Integer.valueOf(balance);
		GUI_Acount x = new GUI_Acount();
		x.ggg(id, name, balance);
		x.frmBigbank.setVisible(true);
	}
}
