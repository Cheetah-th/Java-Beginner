import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt(); // n is array length
		int[] a = new int[n + 1];
		int[] b = new int[n + 1]; // array b for keep array a to calculate
		int[] c = new int[n + 1]; // array c for keep array a to calculate
		getData(a, b, c);
		System.out.println("Data");
		printData(a);
		System.out.println();

		bubbleSortMinToMax(b);
		printData(b);
		System.out.println();

		bubbleSortMaxToMin(c);
		System.out.println("Sort Max To Min");
		printData(c);

	}

	public static void getData(int[] a, int[] b, int[] c) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= a.length - 1; i++) {
			System.out.print("Enter a[" + i + "] : ");
			a[i] = sc.nextInt();
			b[i] = a[i];
			c[i] = a[i];
		}

	}

	public static void printData(int[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}

	public static void bubbleSortMinToMax(int[] b) {
		for (int i = 1; i <= b.length - 2; i++) {
			for (int j = 1; j <= b.length - 2; j++) {
				if (b[j] > b[j + 1]) { // swap data //can change > to <
					int t = b[j]; // t for keep b[j]
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		System.out.println("Sort Min To Max");
	}

	public static void bubbleSortMaxToMin(int[] c) {
		for (int i = 1; i <= c.length - 2; i++) {
			for (int j = 1; j <= c.length - 2; j++) {
				if (c[j] < c[j + 1]) { // swap data //can change > to <
					int t = c[j]; // t for keep c[j]
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
	}

}
