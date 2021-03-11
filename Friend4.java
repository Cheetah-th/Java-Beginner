import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Friend4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		DataOutputStream fileout = new DataOutputStream(new FileOutputStream("FriendZone.dat"));
		String fname;
		String lname;
		String tel;
		String address;
		int zipcode;
		while (true) {
			System.out.print("Enter First Name or Enter -1 to Stop : ");
			fname = sc.nextLine();
			if ((fname).compareTo("-1") == 0) {
				break;
			}
			System.out.print("Enter Last Name : ");
			lname = sc.nextLine();
			System.out.print("Enter Tel : ");
			tel = sc.nextLine();
			System.out.print("Enter Address : ");
			address = sc.nextLine();
			System.out.print("Enter Zipcode : ");
			zipcode = sc.nextInt();
			sc.nextLine();
			fileout.writeUTF(fname);
			fileout.writeUTF(lname);
			fileout.writeUTF(tel);
			fileout.writeUTF(address);
			fileout.writeInt(zipcode);
		}
		fileout.close();

	}

}
