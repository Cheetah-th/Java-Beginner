import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

class FriendType{
	public String kfname;
	public String klname;
	public String ktel;
	public String kAddress;
	public int kzipcode;
	
}

class Friend2 {

	public static void main(String[] args) throws IOException {
		int n = 0;
		FriendType[] a = new FriendType [LineNumberReader(n) + 1];
		GetData(a);
		BubbleSortMinToMax(a);
		Calculate(a);
		System.out.println();
		System.out.println("Total Frined of File FriendZone.txt : " + (a.length - 1));

	}
	
	public static int LineNumberReader(int n) {
		try {
			File file = new File("FriendZone.txt");
			if (file.exists()) {
				FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                n = 0;
                while (lnr.readLine() != null) {
                	n++;
                }
                lnr.close();
			}
			else {
				System.out.println("File doesn't have Data");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return n;
		
	}

	public static void GetData(FriendType[] a) throws IOException {
		Scanner fileIn = new Scanner(new FileReader("FriendZone.txt"));
		for(int i = 1; i <= a.length - 1; i++) {
			a[i] = new FriendType();
			a[i].kfname = fileIn.next();
			a[i].klname = fileIn.next();
			a[i].ktel = fileIn.next();
			a[i].kAddress = fileIn.next();
			a[i].kzipcode = fileIn.nextInt();
		}
		
	}
	
	public static void BubbleSortMinToMax(FriendType[] a) {
		for (int i = 1; i <= a.length - 2; i++) {
			for (int j = 1; j <= a.length - 1 - i; j++) {
				if (a[j].kzipcode > a[j + 1].kzipcode) {
					FriendType t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		
	}
	
	public static void Calculate (FriendType[] a) {
		int oldzip = 0;
		for(int i = 1; i <= a.length - 1; i++) {
			if (oldzip != a[i].kzipcode) {
				if (oldzip != 0) {
					System.out.println();
				}
				System.out.println("Zipcode : " + a[i].kzipcode);
				oldzip = a[i].kzipcode;
			}
			System.out.printf("%10s %10s %15s %30s %8d %n", formText(a[i].kfname, 10), formText(a[i].klname, 10), formText(a[i].ktel, 15), formText(a[i].kAddress, 30), a[i].kzipcode);
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
