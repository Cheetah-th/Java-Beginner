import java.util.Scanner;

public class Sell {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		SellType[] a = new SellType[n + 1];
		
		getData(a);
		System.out.println("Data");
		printData(a);
		System.out.println();
		
		bubbleSortByArea(a);
		System.out.println("Buble By Area");
		printData(a);
		System.out.println();
		
		System.out.println("Total Each Area");
		Total(a);
	}

	public static void getData(SellType[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			a[i] = new SellType();
			System.out.print("Enter Area : ");
			a[i].area = sc.next();
			System.out.print("Enter Name : ");
			a[i].name = sc.next();
			System.out.print("Enter Sell : ");
			a[i].sell = sc.nextInt();
		}
	}

	public static void printData(SellType[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			// System.out.println(a[i].area+" "+a[i].name+" "+a[i].sell);
			System.out.printf("%5s %15s %5d%n", a[i].area, formText(a[i].name, 15), a[i].sell);
		}
	}

	public static void bubbleSortByArea(SellType[] a) {
		for (int i = 1; i <= a.length - 2; i++) {
			for (int j = 1; j <= a.length - 2; j++) {
				if ((a[j].area).compareTo(a[j + 1].area) > 0) {
					SellType t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	public static void Total(SellType[] a) {
		bubbleSortByArea(a);
		int total = 0;
		String oldArea = a[1].area;
		for (int i = 1; i <= a.length - 1; i++) {
			if ((a[i].area).compareTo(oldArea) == 0)
				total += a[i].sell;
			else {
				System.out.println("Total : " + total);
				total = a[i].sell;
				oldArea = a[i].area;
			}
			System.out.printf("%5s %15s %5d%n", a[i].area, formText(a[i].name, 15), a[i].sell);
		}
		System.out.println("Total : " + total);
	}
	
	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}

}
