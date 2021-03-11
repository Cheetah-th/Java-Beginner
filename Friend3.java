import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Friend3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Scanner fileIn = new Scanner(new FileReader("FriendZone.txt"));
		System.out.print("Enter Name to Find : ");
		String Findname = sc.next();
		while (fileIn.hasNext()) {
			String kfname = fileIn.next();
			String klname = fileIn.next();
			String ktel = fileIn.next();
			String kAddress = fileIn.next();
			int kzipcode = fileIn.nextInt();
			if (Findname.compareTo(kfname) == 0) {
				System.out.printf("%10s %10s %15s %30s %8d %n", formText(kfname, 10), formText(klname, 10), formText(ktel, 15), formText(kAddress, 30), kzipcode);
			}
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
